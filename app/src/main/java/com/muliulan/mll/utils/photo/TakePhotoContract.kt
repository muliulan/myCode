import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Environment
import android.provider.MediaStore
import android.util.Log
import androidx.activity.result.contract.ActivityResultContract
import androidx.annotation.CallSuper
import androidx.core.content.FileProvider
import androidx.core.content.contentValuesOf
import java.io.File

/**
 * 拍照协定
 * Input type  : Unit? 不需要传值
 * Output type : Uri?  拍照完成后的uri
 */
class TakePhotoContract : ActivityResultContract<Unit?, Uri?>() {

    private var uri: Uri? = null

    @CallSuper
    override fun createIntent(context: Context, input: Unit?): Intent {
        val mimeType = "image/jpeg"
        val fileName = "${System.currentTimeMillis()}.jpg"
        uri = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            // Android 10 及以上获取图片uri
            val values = contentValuesOf(
                Pair(MediaStore.MediaColumns.DISPLAY_NAME, fileName),
                Pair(MediaStore.MediaColumns.MIME_TYPE, mimeType),
                Pair(MediaStore.MediaColumns.RELATIVE_PATH, Environment.DIRECTORY_DCIM)
            )
            context.contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, values)
        } else {
            // Android 9 及以下获取图片uri
            FileProvider.getUriForFile(
                context, "${context.packageName}.fileprovider",
                File(context.externalCacheDir!!.absolutePath, fileName)
            )
        }
        return Intent(MediaStore.ACTION_IMAGE_CAPTURE).putExtra(MediaStore.EXTRA_OUTPUT, uri)
    }

    override fun parseResult(resultCode: Int, intent: Intent?): Uri? {
        Log.e("mll 相机", "take photo uri : $uri")
        return uri
    }
}
