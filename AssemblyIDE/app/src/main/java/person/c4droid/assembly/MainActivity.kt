package person.c4droid.assembly
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.support.v7.app.AlertDialog
import java.io.File
import java.io.IOException
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*
        * at program start,
        * if not editing file,
        * show create project dialog,
        * else do nothing.
        */
        val item = arrayOf("GNU as","nasm")
        val dialog = AlertDialog.Builder(this@MainActivity)
        dialog.setTitle("New Project...")
        dialog.setItems(item) {
            dialog,which ->
            // if click the GNU as,call gnuDialog,else call nasmDialog
            when (item[which].toString()) {
                "GNU as" -> {
                    // gnuDialog()
                    // TODO: create GNU as Project
                }
                "nasm" -> {
                    // nasmDialog()
                    // TODO: create nasm project
                }
            }
        }
        dialog.show()
    }
}