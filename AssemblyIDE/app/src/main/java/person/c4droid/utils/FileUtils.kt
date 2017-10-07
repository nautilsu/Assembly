package person.c4droid.utils
import java.io.*
object FileUtils {
    fun copyToFile(inputStream: InputStream, destFile: File): Boolean {
        try {
            if (destFile.exists()) destFile.delete()
            val out = FileOutputStream(destFile)
            try {
                val buffer = ByteArray(4096)
                var bytesRead: Int = inputStream.read(buffer)
                while (bytesRead >= 0)
                    out.write(buffer, 0, bytesRead)
            } finally {
                out.close()
            }
            return true
        } catch (e: IOException) {
            return false
        }

    }
    fun copyFile(srcFile: File, destFile: File): Boolean {
        var result = true
        try {
            val inputStream = FileInputStream(srcFile)
            try {
                result = copyToFile(inputStream, destFile)
            } finally {
                inputStream.close()
            }
        } catch (e: IOException) {
            result = false
        }
        return result
    }
}