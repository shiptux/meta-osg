LICENSE = "LGPLv2.1+"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=e7fbbccbb3c1537e5b330f9e2c6d2620"

# SRC_URI[md5sum] = "c532bf5dca74b955393658929c1801d0"
# SRC_URI[sha256sum] = "07745925344bc74dec9e2c441ccaca746c34a67895b93e14326ab2856354b0aa"
# SRC_URI = "https://github.com/gwaldron/osgearth/archive/osgearth-${PV}.zip"

SRCREV = "master"
SRC_URI = "git://github.com/gwaldron/osgearth.git;protocol=http"

# S = "${WORKDIR}/osgearth-osgearth-${PV}"
S = "${WORKDIR}/git"

DEPENDS = "openscenegraph gdal curl"

inherit pkgconfig cmake

FILES_${PN} += " \
	/usr/lib/osgdb* \
	/usr/lib/libosgEarth* \
	/usr/bin/osgearth* \
"

