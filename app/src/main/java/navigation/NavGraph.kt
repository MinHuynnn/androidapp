package navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import screens.SplashScreen
import screens.StartedFirst
import screens.StartedSecond
import screens.StartedThird

object Routes {
    const val Splash = "splash"
    const val First = "started_first"
    const val Second = "started_second"
    const val Third = "started_third"
}

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Routes.Splash
    ) {
        composable(Routes.Splash) {
            SplashScreen(navController)
        }
        composable(Routes.First) {
            StartedFirst(navController)
        }
        composable(Routes.Second) {
            StartedSecond(navController)
        }
        composable(Routes.Third) {
            StartedThird(navController)
        }
    }
}
