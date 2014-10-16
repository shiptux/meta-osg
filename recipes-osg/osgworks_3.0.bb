LICENSE = "LGPLv2.1+"
LIC_FILES_CHKSUM = "file://include/osgwTools/Version.h.in;md5=ec6c7a13ff6d825b4cae5ec639e7d380"
SRCREV = "565"
SRC_URI = "svn://osgworks.googlecode.com/svn/tags;module=osgWorks_03_00_00;protocol=http"

S = "${WORKDIR}/osgWorks_03_00_00"

DEPENDS = "openscenegraph"

inherit pkgconfig cmake

FILES_${PN} += " \
	/usr/share/osgWorks/extra \
	/usr/share/osgWorks/data/* \
	/usr/lib/* \
"

