package net.numa08.vboxluncher

object App {

  def main(args: Array[String]) {
  	try { 
  	  runApp(args.toList)
  	  System.exit(0)
  	} catch {
  	  case e: Exception => System.exit(1)
  	}
  }

  def runApp(args: List[String]) = {
  	args match {
  		 case "status" :: subArgs=> subArgs match {
  			case "all" :: Nil => println("status all")
  			case "name" :: names => println("show boxes satatus")
  			case _ => println(usage)
  		}

  		case "start" :: subArgs => subArgs match {
  			case "all" :: Nil => println("start all")
  			case "name" :: names => println("start boxes")
  			case _ => println(usage)
  		}

  		case "stop" :: subArgs => subArgs match {
  			case "all" :: Nil => println("stop all")
  			case "name" :: names => println("stop boxes")
  			case _ => println(usage)
  		}
  		case _ => println(usage)
  	}
  	
  }

  val usage = """|usage:
  				 | this is usage
  			  """.stripMargin
}
