package navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import screens.*

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screen.ForgotPassword.route) {
        composable(Screen.ForgotPassword.route) {
            ForgotPasswordScreen(onNext = { email ->
                navController.navigate(Screen.VerifyCode.createRoute(email))
            })
        }
        composable(
            route = Screen.VerifyCode.route,
            arguments = listOf(navArgument("email") { type = NavType.StringType })
        ) { backStackEntry ->
            val email = backStackEntry.arguments?.getString("email") ?: ""
            VerifyCodeScreen(
                email = email,
                onBack = { navController.popBackStack() },
                onNext = { navController.navigate(Screen.ResetPassword.createRoute(email)) }
            )
        }
        composable(
            route = Screen.ResetPassword.route,
            arguments = listOf(navArgument("email") { type = NavType.StringType })
        ) { backStackEntry ->
            val email = backStackEntry.arguments?.getString("email") ?: ""
            ResetPasswordScreen(
                email = email,
                onBack = { navController.popBackStack() },
                onNext = { password ->
                    navController.navigate(Screen.Confirm.createRoute(email, password))
                }
            )
        }
        composable(
            route = Screen.Confirm.route,
            arguments = listOf(
                navArgument("email") { type = NavType.StringType },
                navArgument("password") { type = NavType.StringType }
            )
        ) { backStackEntry ->
            val email = backStackEntry.arguments?.getString("email") ?: ""
            val password = backStackEntry.arguments?.getString("password") ?: ""
            ConfirmScreen(
                email = email,
                password = password,
                code = "123456", // hoặc truyền nếu có thật
                onBack = { navController.popBackStack() }
            )
        }
    }
}
