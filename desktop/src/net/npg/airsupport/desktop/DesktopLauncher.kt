package net.npg.airsupport.desktop

import com.badlogic.gdx.backends.lwjgl.LwjglApplication
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration
import net.npg.airsupport.AirSupportMain

/**
 * Created by cymric on 15.07.2017.
 */

fun main(args: Array<String>) {
    val config = LwjglApplicationConfiguration()
    LwjglApplication(AirSupportMain(), config)
}