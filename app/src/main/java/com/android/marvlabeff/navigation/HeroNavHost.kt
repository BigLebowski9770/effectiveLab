package com.android.marvlabeff.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.android.marvlabeff.screens.*

sealed class NavRoute(val route: String) {
    object Main : NavRoute("main_screen")
    object Cpt_america : NavRoute("cpt_america_screen")
    object Iron_man : NavRoute("iron_man_screen")
    object Thor : NavRoute("thor_screen")
    object Deadpool : NavRoute("peadpool_screen")
    object Doctor : NavRoute("doctor_screen")
    object Spiderman : NavRoute("spiderman_screen")
    object Thanos : NavRoute("thanos_screen")
}


@Composable
fun HeroNavHost() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = NavRoute.Main.route) {

        composable(NavRoute.Main.route) { MainScreen(navController = navController) }

        composable(NavRoute.Cpt_america.route) { CptAmericaScreen(navController = navController) }

        composable(NavRoute.Iron_man.route) { IronManScreen(navController = navController) }

        composable(NavRoute.Thor.route) { ThorScreen(navController = navController) }

        composable(NavRoute.Deadpool.route) { DeadpoolScreen(navController = navController) }

        composable(NavRoute.Doctor.route) { DoctorScreen(navController = navController) }

        composable(NavRoute.Spiderman.route) { SpidermanScreen(navController = navController) }

        composable(NavRoute.Thanos.route) { ThanosScreen(navController = navController) }
    }
}
