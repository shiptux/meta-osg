LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7f6709959f8a4f895aa10e357dbbe5bf"
SRC_URI[md5sum] = "c96ffb3ad358047d076c9af7f74635d9"
SRC_URI[sha256sum] = "a93f41d8579b909ee23b593b500fd190739c4a446c13f663f5bb7c9b6707f03d"
SRC_URI = "http://downloads.sourceforge.net/project/geographiclib/distrib/GeographicLib-1.36.tar.gz"

S = "${WORKDIR}/GeographicLib-1.36"

inherit autotools

FILES_${PN} += " \
	/usr/share/cmake/GeographicLib/FindGeographicLib.cmake \
	/usr/lib/python/site-packages/geographiclib/* \
"

