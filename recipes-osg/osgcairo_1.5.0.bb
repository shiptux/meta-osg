LICENSE = "LGPLv2.1+"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9226151d58bcdf987ed14e7dc8cedcbc"
SRCREV = "152"
SRC_URI = "svn://osgcairo.googlecode.com/svn/tags;module=1.5.0;protocol=http"

S = "${WORKDIR}/1.5.0"

DEPENDS = "openscenegraph"

inherit pkgconfig cmake

FILES_${PN} = " \
	/usr/lib/libosgCairo* \
	/usr/bin/osgcairo* \
"

FILES_${PN}-dev = " /usr/include/osgCairo "

