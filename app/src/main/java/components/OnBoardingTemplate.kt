package components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp

@Composable
fun OnBoardingTemplate(
    image: Painter,
    title: String,
    description: String,
    onBack: (() -> Unit)? = null,
    onNext: (() -> Unit)? = null,
    onSkip: (() -> Unit)? = null,
    finalStep: Boolean = false
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End) {
            TextButton(onClick = { onSkip?.invoke() }) {
                Text("Skip")
            }
        }

        Image(painter = image, contentDescription = null)

        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = title, style = MaterialTheme.typography.titleLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = description, style = MaterialTheme.typography.bodyMedium)
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            if (onBack != null) {
                Button(onClick = onBack) {
                    Text("Back")
                }
            } else {
                Spacer(modifier = Modifier.width(8.dp))
            }

            Button(onClick = { onNext?.invoke() }) {
                Text(if (finalStep) "Get Started" else "Next")
            }
        }
    }
}
