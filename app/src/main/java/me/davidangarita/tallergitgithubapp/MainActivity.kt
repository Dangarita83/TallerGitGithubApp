package me.davidangarita.tallergitgithubapp

import android.R
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.davidangarita.tallergitgithubapp.ui.theme.TallerGitGithubAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Presentation()

        }
    }
}



@Preview(showBackground = true,
    showSystemUi = true )
@Composable
fun Presentation(){
    Column() {

        // NO SE PORQUE NO FUNICIONA LA IMAGEN

   //    Image(
         //   painter = painterResource(id = R.drawable.mainimage), //
         //  contentDescription = "usuario", //
          //  modifier = Modifier
        //  .fillMaxWidth()
        //  .size(120.dp)
        //    .clip(CircleShape)
    //   )





        Text(
            text = "David Alejandro Angarita Avendaño",
            color = Color.Gray,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(
                    top = 30.dp
                )
                .fillMaxWidth()
        )

        Text(
            text = "Estudiante Ing. Sistemas",
            fontSize = 20.sp,
            color = Color.Gray,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(
                    top = 10.dp
                )
                .fillMaxWidth()
        )

        Text(
            text = "EDAD",
            color = Color.Gray,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(
                    start = 30.dp,
                    end = 30.dp,
                )
        )

        Text(
            text = "20 años",
            color = Color.Gray,
            fontSize = 18.sp,
            modifier = Modifier
                .padding(
                    start = 30.dp,
                    bottom =  10.dp,
                    end = 30.dp,
                )
        )

        Text(
            text = "CORREO",
            color = Color.Gray,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(
                    start = 30.dp,
                    end = 30.dp
                )
        )

        Text(
            text = "dangarita83@unab.edu.co",
            color = Color.Gray,
            fontSize = 18.sp,

            modifier = Modifier
                .padding(
                    start = 30.dp,
                    bottom =  10.dp,
                    end = 30.dp
                )
        )

        Text(
            text = "Ciudad",
            color = Color.Gray,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(
                    start = 30.dp,
                    end = 30.dp
                )
        )

        Text(
            text = "Bucaramanga",
            color = Color.Gray,
            fontSize = 18.sp,

            modifier = Modifier
                .padding(
                    start = 30.dp,
                    end = 30.dp
                )
        )

        Text(
            text = "SOBRE MI MATERIA FAVORITA",
            color = Color.Gray,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(
                    top = 30.dp,
                    bottom = 20.dp,
                )
                .fillMaxWidth()
        )

        Text(
            text = "Aun no descubro muy bien cual es la rama de la carrera que me apasiona, de momento me esta gustando mucho todo lo que tiene que ver con bases de datos, analisis de datos y en general la ciencia de datos.",
            color = Color.Gray,
            textAlign = TextAlign.Center,
            fontSize = 15.sp,

            modifier = Modifier
                .padding(
                    start = 30.dp,
                    end = 30.dp

                )
        )

        Box(modifier = Modifier.fillMaxSize()) {

            Button(
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .fillMaxWidth()
                    .padding(16.dp),
                onClick = { /* helous */ }
            ) {
                Text(text = "Contactar conmigo")
            }
        }

    }









}