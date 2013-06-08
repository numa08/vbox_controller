package net.numa08.vboxluncher

object App {

  def main(args: Array[String]) {
  	args.toList match {
  		case "status" :: subArgs=> println("status command")
  		case _ => println(usage)
  	}
  	
  }

  def run(args: Array[String]):Int = {
  	try { 
  		main(args)
  		0
  	} catch {
  	  case e: Exception => 1
  	}
  }

  val usage = """|usage:
  				 | this is usage
  			  """.stripMargin
}
