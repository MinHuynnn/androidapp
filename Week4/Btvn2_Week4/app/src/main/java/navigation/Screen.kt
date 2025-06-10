package navigation

sealed class Screen(val route: String) {

    object ForgotPassword : Screen("forgot_password")

    object VerifyCode : Screen("verify_code/{email}") {
        fun createRoute(email: String) = "verify_code/$email"
    }

    object ResetPassword : Screen("reset_password/{email}") {
        fun createRoute(email: String) = "reset_password/$email"
    }

    object Confirm : Screen("confirm/{email}/{password}") {
        fun createRoute(email: String, password: String) = "confirm/$email/$password"
    }
}
