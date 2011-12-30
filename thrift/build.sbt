name := "indextank-thrift"


resolvers += "twitter.com" at "http://maven.twttr.com"

libraryDependencies ++= Seq("com.twitter" %% "ostrich" % "4.10.1",
      "com.twitter" %% "util" % "1.12.8",
      "com.twitter" %% "finagle" % "1.9.11")