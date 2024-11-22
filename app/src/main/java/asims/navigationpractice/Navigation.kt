package asims.navigationpractice

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun myNavigation(){
    var navController = rememberNavController()
    NavHost(navController = navController, startDestination = Routes.screenA, builder = {
        composable(Routes.screenA){
            screenA(navController)
        }
        composable(Routes.screenB + "/{name}",){
            val name = it.arguments?.getString("name")
            screenB(name?:"no name")
        }

    })

}