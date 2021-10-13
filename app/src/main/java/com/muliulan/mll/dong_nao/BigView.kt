package com.muliulan.mll.dong_nao

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.GestureDetector
import android.view.MotionEvent
import android.view.View
import android.widget.Scroller
import java.io.InputStream

/**
描述:     处理长图
zhaochenshuo
2021/5/10
 */

class BigView(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) :
    View(context, attrs, defStyleAttr), GestureDetector.OnGestureListener, View.OnTouchListener {

    /**
     * 使用
     *       val bigView = findViewById<BigView>(R.id.bigView)
     *      var inps: InputStream? = null
     *      try {
     *          //加载图片
     *          inps = assets.open("big.png")
     *          bigView.setImage(inps)
     *      } catch (e: Exception) {
     *          e.printStackTrace()
     *      } finally {
     *          if (inps != null) {
     *      try {
     *          inps.close()
     *      } catch (e: IOException) {
     *          e.printStackTrace()
     *      }
     *      }
     *      }
     * */




    //内存管理类 屏幕显示的区域
    private val rect: Rect by lazy { Rect() }
    private val options: BitmapFactory.Options by lazy { BitmapFactory.Options() }

    //手势滑动
    val gestureDetector: GestureDetector by lazy { GestureDetector(context, this) }

    //滑动帮助类
    val scroller: Scroller by lazy { Scroller(context) }

    //图片的宽高
    var imageHeight: Int = 0
    var imageWidth: Int = 0

    //测量view的大小
    private var mViewHeight: Int = 0
    private var mViewWidth: Int = 0

    //创建一个区域解码器
    private var mDecoder: BitmapRegionDecoder? = null

    //缩放倍数
    private var mScale: Float = 0f
    private var bitmap: Bitmap? = null


    init {
        setOnTouchListener(this)

    }

    fun setImage(ips: InputStream) {
        //1 能读取到图片的宽高 不会加载到内存
        options.inJustDecodeBounds = true
        //2 读取完图片
        BitmapFactory.decodeStream(ips, null, options)
        imageHeight = options.outHeight
        imageWidth = options.outWidth
        //3 开启裂变 图片复用
        options.inMutable = true
        //4 压缩色值 565
        options.inPreferredConfig = Bitmap.Config.RGB_565
        options.inJustDecodeBounds = false
        //5 创建一个解码器
        mDecoder = BitmapRegionDecoder.newInstance(ips, false)

        requestLayout()
    }


    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        //6 测量view的大小
        mViewHeight = measuredHeight
        mViewWidth = measuredWidth
        if (mDecoder == null) {
            return
        }
        //7 确定加载图片的区域
        rect.top = 0
        rect.left = 0
        rect.right = imageWidth
        //8 获取缩放比例
        mScale = mViewWidth.toFloat() / imageWidth.toFloat()
        rect.bottom = (mViewHeight.toFloat() / mScale).toInt()
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        //9 开始绘制
        options.inBitmap = bitmap
        //10 解密出刚才设置的区域
        bitmap = mDecoder?.decodeRegion(rect, options)
        //11 通过matrix对矩阵大小进行缩放
        val matrix = Matrix()
        matrix.setScale(mScale, mScale)
        //12 画出来
        canvas?.drawBitmap(bitmap!!, matrix, null)
    }

    override fun onTouch(v: View?, event: MotionEvent?): Boolean {
        //13 处理手势
        return gestureDetector.onTouchEvent(event)
    }

    override fun onDown(e: MotionEvent?): Boolean {
        //14 手指按下强行停止惯性滑动
        if (!scroller.isFinished) {
            scroller.forceFinished(true)
        }
        return true
    }

    override fun onScroll(
        e1: MotionEvent?,//按下的事件
        e2: MotionEvent?,//当前手指事件
        distanceX: Float,
        distanceY: Float
    ): Boolean {
        rect.offset(0, distanceY.toInt())

        //防止滑动超出
        if (rect.bottom > imageHeight) {
            rect.bottom = imageWidth
            rect.top = mViewHeight - (imageHeight / mScale).toInt()
        }
        //重绘
        invalidate()
        return false
    }

    override fun onFling(
        e1: MotionEvent?,
        e2: MotionEvent?,
        velocityX: Float,
        velocityY: Float
    ): Boolean {
        //处理惯性问题
        scroller.fling(
            0, rect.top,
            0, -velocityY.toInt(),
            0, 0,
            0, imageHeight - (mViewHeight / mScale).toInt()
        )

        return false
    }

    //使用上一个接口的计算结果
    override fun computeScroll() {
        if (scroller.isFinished) {
            return
        }

        // 当前滑动还没有结束
        if (scroller.computeScrollOffset()) {
            rect.top = scroller.currY
            rect.bottom = rect.top + (mViewHeight / mScale).toInt()
            invalidate()
        }

    }


    override fun onShowPress(e: MotionEvent?) {
    }

    override fun onSingleTapUp(e: MotionEvent?): Boolean {
        return false
    }


    override fun onLongPress(e: MotionEvent?) {

    }


}