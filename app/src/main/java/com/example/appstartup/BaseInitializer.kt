import android.content.Context
import androidx.startup.Initializer
import com.example.appstartup.Sign3IntelligenceInitializer

abstract class BaseInitializer<T : Any> : Initializer<T> {



    override fun dependencies(): List<Class<out Initializer<*>>> {
        return listOf(Sign3IntelligenceInitializer::class.java)
    }
}