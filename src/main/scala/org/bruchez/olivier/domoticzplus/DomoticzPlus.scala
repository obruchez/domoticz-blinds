package org.bruchez.olivier.domoticzplus

object DomoticzPlus {
  def main(args: Array[String]): Unit = {
    println("Hello, world.")
  }
}

/*
API: http://<username:password@>domoticz-ip<:port>/json.htm?api-call

To add: watchdog that restart domoticz when frozen (frozen if no answer from API

Sunrise/sunset: /json.htm?type=command&param=getSunRiseSet

To add: temperature logger => local database or other format
 */
