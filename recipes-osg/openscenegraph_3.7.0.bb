LICENSE = "OSGPL"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=1997b5e8aad6beab407654a49b4ac50c"
SRCREV = "2e4ae2ea94595995c1fc56860051410b0c0be605"
SRC_URI = "git://github.com/openscenegraph/OpenSceneGraph.git;branch=master;protocol=https\
           file://0001-Add-Wayland-support.patch\
           file://0002-Disable-try_run-for-crosscompile.patch\
           file://0003-Enable-gles2-for-OPENGL_gl_LIBRARY.patch\
"
S = "${WORKDIR}/git"

DEPENDS += "\
        mesa \
        libx11\
	libpng \
	jpeg \
	tiff \
	giflib \
	jasper \
	libsdl \
        curl \
	xrandr-native \
"

inherit pkgconfig cmake

EXTRA_OECMAKE = " \
	-D_OPENTHREADS_ATOMIC_USE_GCC_BUILTINS_EXITCODE=1 \
"

FILES_${PN} += " \
	/usr/lib/osgPlugins-3.7.0/* \
	/usr/bin/osg* \
	/usr/bin/present3D \
	/usr/lib/libosg* \
	/usr/lib/libOpenThread* \
"

FILES_${PN}-dbg += "/usr/lib/osgPlugins-3.7.0/.debug/*"

