addSbtPlugin("com.earldouglas" % "xsbt-web-plugin" % "4.2.4")
addSbtPlugin("com.github.sbt" % "sbt-pgp" % "2.1.2")
addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "3.9.10")
addSbtPlugin("com.github.sbt" % "sbt-unidoc" % "0.5.0")
addSbtPlugin("com.typesafe" % "sbt-mima-plugin" % "1.0.1")
addSbtPlugin("com.typesafe.sbt" % "sbt-git" % "1.0.2")
addSbtPlugin("com.eed3si9n" % "sbt-buildinfo" % "0.10.0")
addSbtPlugin("org.scalariform" % "sbt-scalariform" % "1.8.3")
addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.6.0")

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature")
