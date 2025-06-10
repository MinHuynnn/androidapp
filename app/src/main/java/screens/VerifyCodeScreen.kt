    package screens

    import androidx.compose.ui.tooling.preview.Preview


    import androidx.compose.foundation.Image
    import androidx.compose.foundation.layout.*
    import androidx.compose.foundation.shape.RoundedCornerShape
    import androidx.compose.foundation.text.KeyboardOptions
    import androidx.compose.material.icons.Icons
    import androidx.compose.material.icons.filled.ArrowBack
    import androidx.compose.material3.*
    import androidx.compose.runtime.*
    import androidx.compose.ui.*
    import androidx.compose.ui.text.input.*
    import androidx.compose.ui.unit.dp
    import androidx.compose.ui.Alignment
    import androidx.compose.ui.graphics.Color
    import androidx.compose.ui.res.painterResource
    import androidx.compose.ui.text.font.FontWeight
    import androidx.compose.ui.text.style.TextAlign
    import androidx.compose.ui.unit.sp
    import com.example.btvn2_week4.R

    @Preview(showBackground = true, showSystemUi = true)
    @Composable
    fun PreviewVerifyCodeScreen() {
        VerifyCodeScreen(email = "user@example.com")
    }


    @Composable
    fun VerifyCodeScreen(email: String, onBack: () -> Unit = {}, onNext: () -> Unit = {}) {
        val code = remember { mutableStateListOf("", "", "", "", "", "") }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(16.dp))


            Row(modifier = Modifier.fillMaxWidth()) {
                IconButton(onClick = onBack) {
                    Icon(Icons.Default.ArrowBack, contentDescription = "Back",
                        tint = Color(0xFF0099FF))
                }
            }


            Image(
                painter = painterResource(id = R.drawable.logo_uth),
                contentDescription = "UTH Logo",
                modifier = Modifier.
                height(100.dp)
            )

            Spacer(modifier = Modifier.
            height(8.dp))

            Text("SmartTasks", fontSize = 24.sp, fontWeight = FontWeight.Bold, color = Color(0xFF0099FF))
            Spacer(modifier = Modifier.
            height(16.dp))
            Text("Verify Code", style = MaterialTheme.typography.titleLarge, fontWeight = FontWeight.Bold)
            Text("Enter the code we just sent to $email", textAlign = TextAlign.Center)

            Spacer(modifier = Modifier.
            height(24.dp))


            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier.fillMaxWidth()
            ) {
                code.forEachIndexed { index, value ->
                    OutlinedTextField(
                        value = value,
                        onValueChange = {
                            if (it.length <= 1 && it.all { char -> char.isDigit() }) {
                                code[index] = it
                            }
                        },
                        singleLine = true,
                        textStyle = LocalTextStyle.current.copy(
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp
                        ),
                        modifier = Modifier
                            .width(50.dp)
                            .height(55.dp),
                        shape = RoundedCornerShape(8.dp),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                    )
                }
            }

            Spacer(modifier = Modifier.
            height(24.dp))

            Button(
                onClick = { onNext() },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp),
                shape = RoundedCornerShape(25.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF0099FF))
            ) {
                Text("Next")
            }
        }
    }

