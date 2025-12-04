package es.fpsumma.dam2.utilidades.ui.screens.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableDoubleStateOf
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import es.fpsumma.dam2.utilidades.ui.navigation.Routes

@Composable
fun HomeScreen(navController: NavController) {

    var asiganura by remember { mutableStateOf("") }
    var nota by remember { mutableDoubleStateOf(0.0) }




    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {

       // OutlinedTextField(
           // value =
     //   )





            Button(
                onClick = { navController.navigate(Routes.LISTADO_TAREAS) },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Listado de tareas")
            }







    }
}


@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    val navController = rememberNavController()

    HomeScreen(navController = navController )
}