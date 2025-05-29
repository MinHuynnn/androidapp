package screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.compose.ui.text.withStyle
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack

@Composable
fun TextDetailScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp)
    ) {
        // Top bar with back button and title
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = { navController.popBackStack() }) {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "Back",
                    tint = Color.Black // ← Màu đen như bạn yêu cầu
                )
            }
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = "Text Detail",
                fontSize = 20.sp,
                color = Color(0xFF007AFF),
                modifier = Modifier.weight(1f),
                textAlign = androidx.compose.ui.text.style.TextAlign.Center
            )
            Spacer(modifier = Modifier.width(48.dp)) // để cân đối layout bên phải
        }

        // Spacer to push text into center of screen
        Spacer(modifier = Modifier.height(80.dp))

        // Main text block centered horizontally
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            contentAlignment = Alignment.Center
        ) {
            Text(
                buildAnnotatedString {
                    withStyle(SpanStyle(fontSize = 40.sp)) {
                        append("The ")
                        withStyle(SpanStyle(textDecoration = TextDecoration.LineThrough)) {
                            append("quick ")
                        }
                        withStyle(
                            SpanStyle(
                                color = Color(0xFFB86B00),
                                fontWeight = FontWeight.Bold
                            )
                        ) {
                            append("Brown")
                        }
                    }

                    append("\n")

                    withStyle(SpanStyle(fontSize = 40.sp)) {
                        append("fox j u m p s ")
                        withStyle(
                            SpanStyle(
                                fontWeight = FontWeight.Bold,
                                fontStyle = FontStyle.Italic
                            )
                        ) {
                            append("over")
                        }
                    }

                    append("\n")

                    withStyle(SpanStyle(fontSize = 40.sp)) {
                        append("the ")
                        withStyle(
                            SpanStyle(
                                fontStyle = FontStyle.Italic,
                                textDecoration = TextDecoration.Underline
                            )
                        ) {
                            append("lazy")
                        }
                        append(" dog.")
                    }
                },
                textAlign = androidx.compose.ui.text.style.TextAlign.Center
            )
        }

        Divider(modifier = Modifier.padding(vertical = 16.dp))
    }
}







