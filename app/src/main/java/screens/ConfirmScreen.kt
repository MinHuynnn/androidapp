package screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.btvn2_week4.R
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ConfirmScreenPreview() {
    ConfirmScreen(
        email = "uth@gmail.com",
        code = "123456",
        password = "********",
        onBack = {}
    )
}

@Composable
fun ConfirmScreen(
    email: String,
    code: String,
    password: String,
    onBack: () -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(24.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Row(modifier = Modifier.fillMaxWidth()) {
                Surface(
                    shape = CircleShape,
                    color = Color(0xFF00B0FF),
                    modifier = Modifier.size(36.dp)
                ) {
                    IconButton(onClick = onBack) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Back",
                            tint = Color.White
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(8.dp))


            Image(
                painter = painterResource(id = R.drawable.logo_uth),
                contentDescription = "UTH Logo",
                modifier = Modifier
                    .height(100.dp)
                    .padding(bottom = 8.dp)
            )


            Text(
                "SmartTasks",
                color = Color(0xFF1976D2),
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                "Confirm",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )

            Text(
                "We are here to help you!",
                fontSize = 14.sp,
                color = Color.Gray
            )

            Spacer(modifier = Modifier.height(24.dp))

            // Email
            OutlinedTextField(
                value = email,
                onValueChange = {},
                label = { Text("Email") },
                leadingIcon = {
                    Icon(Icons.Default.Person, contentDescription = null, tint = Color(0xFF1976D2))
                },
                readOnly = true,
                modifier = Modifier
                    .fillMaxWidth(),
                shape = RoundedCornerShape(12.dp)
            )

            Spacer(modifier = Modifier.height(12.dp))

            // Mã OTP
            OutlinedTextField(
                value = code,
                onValueChange = {},
                label = { Text("OTP Code") },
                leadingIcon = {
                    Icon(Icons.Default.Email, contentDescription = null, tint = Color(0xFF1976D2))
                },
                readOnly = true,
                modifier = Modifier
                    .fillMaxWidth(),
                shape = RoundedCornerShape(12.dp)
            )

            Spacer(modifier = Modifier.height(12.dp))


            OutlinedTextField(
                value = password,
                onValueChange = {},
                label = { Text("New Password") },
                leadingIcon = {
                    Icon(Icons.Default.Lock, contentDescription = null, tint = Color(0xFF1976D2))
                },
                visualTransformation = PasswordVisualTransformation(),
                readOnly = true,
                modifier = Modifier
                    .fillMaxWidth(),
                shape = RoundedCornerShape(12.dp)
            )

            Spacer(modifier = Modifier.height(24.dp))


            Button(
                onClick = {  },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp),
                shape = RoundedCornerShape(50),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF00B0FF))
            ) {
                Text("Next", color = Color.White, fontSize = 16.sp)
            }
        }
    }
}
