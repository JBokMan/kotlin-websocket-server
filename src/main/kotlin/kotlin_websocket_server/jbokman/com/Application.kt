package kotlin_websocket_server.jbokman.com

import io.ktor.server.application.*
import kotlin_websocket_server.jbokman.com.plugins.*

fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // application.conf references the main function. This annotation prevents the IDE from marking it as unused.
fun Application.module() {
    configureSockets()
    configureRouting()
}
