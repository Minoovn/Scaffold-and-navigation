import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun App() {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home") {

        composable("home") {
            Button(onClick = {
                navController.navigate("second")
            }) {
                Text("Go To Second Page")
            }
        }

        composable("second") {
            Button(onClick = {
                navController.navigate("home")
            }) {
                Text("Back To Home")
            }
        }
    }
}
