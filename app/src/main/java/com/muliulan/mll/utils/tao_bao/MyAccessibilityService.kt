import android.accessibilityservice.AccessibilityService
import android.os.Build
import android.view.accessibility.AccessibilityEvent
import androidx.annotation.RequiresApi
import com.blankj.utilcode.util.LogUtils
import kotlin.concurrent.thread

/**

模拟点击


跳转开启服务页面 AsUtils.jumpToAccessibilitySetting(this)
服务是否开启状态获取：AsUtils.isServiceON( this, MyAccessibilityService::class.java.name )


清单文件给application设置   android:networkSecurityConfig="@xml/network_security_config"

 */
class MyAccessibilityService : AccessibilityService() {

    override fun onAccessibilityEvent(event: AccessibilityEvent) {
        //获取指定包名应用
        val packageName = event.packageName
        //只使用界面变化的监听，避免点击事件监听进入死循环
        if (AccessibilityEvent.TYPE_WINDOW_STATE_CHANGED != event.eventType) {
            return
        }
        if ("com.yufs.accessibility" == packageName) {
            LogUtils.e("Thread:${Thread.currentThread().name},event:${event}")
            //找到对应node，开始点击
            val nodeInfo = AsUtils.findNodeInfo(
                this,
                "com.yufs.accessibility:id/btn_click_node",
                "节点模拟点击",
                ""
            )
            nodeInfo?.let {
                thread {
                    LogUtils.e("找到节点，三秒后执行点击事件")
                    Thread.sleep(3000)
                    AsUtils.performClickNodeInfo(it)
                }
            }


        }
    }

    override fun onInterrupt() {
        LogUtils.e("onInterrupt==>")
    }

    /**
     * 服务连接成功
     */
    @RequiresApi(Build.VERSION_CODES.N)
    override fun onServiceConnected() {
        super.onServiceConnected()
        thread {
            //便于设置完成后返回来看到显示效果
            Thread.sleep(5000)
            LogUtils.e("坐标点击：500,515")
            AsUtils.click(this, 100f, 100f)
        }
    }
}