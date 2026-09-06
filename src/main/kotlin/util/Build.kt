package util

import java.util.*

/**
 * contains build information
 * @author McAJBen@gmail.com
 */
object Build {

	val VERSION: String

	init {
		val stream = javaClass.getResourceAsStream("/version.properties")
		val properties = Properties()
		
		if (stream != null) {
			properties.load(stream)
			stream.close()
		}
		VERSION = properties.getProperty("version", "dev")

	}
}
