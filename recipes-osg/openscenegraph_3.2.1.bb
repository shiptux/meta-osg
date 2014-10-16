LICENSE = "OSGPL"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=2c38926f611bfbd5a3be0f817c8d2dad"
SRC_URI[md5sum] = "4f95206a1eef218bd007c3b43e1334f5"
SRC_URI[sha256sum] = "d9ae72263d0191855b0f804d93c586d489f119aca0499292acc09bb0fa0b3e6d"
SRC_URI = "http://www.openscenegraph.org/downloads/developer_releases/OpenSceneGraph-${PV}.zip"

S = "${WORKDIR}/OpenSceneGraph-${PV}"

DEPENDS += "mesa-gl"

inherit pkgconfig cmake

EXTRA_OECMAKE = " \
	-D_OPENTHREADS_ATOMIC_USE_GCC_BUILTINS_EXITCODE=1 \
"

FILES_${PN} += " \
	/usr/lib/osgPlugins-3.2.1/* \
	/usr/bin/osg* \
	/usr/bin/present3D \
	/usr/lib/libosg* \
	/usr/lib/libOpenThread* \
"

FILES_${PN}-dbg += "/usr/lib/osgPlugins-3.2.1/.debug/*"

