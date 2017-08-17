# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=cbbd27594afd089daa160d3a16dd515a"

SRC_URI = "https://github.com/ament/gtest_vendor/archive/${PV}.tar.gz";downloadfilename=ros2_${PN}_${PV}.tar.gz"
SRC_URI[md5sum] = "7262ce63da8a29c5d6236be20ea70d74"
SRC_URI[sha256sum] = "3ba938d7aa59d27c07c5f07126b4eafcfca8bcc9a544d58a1077f1c9120fcf42"

S = "${WORKDIR}/gtest_vendor-${PV}"

inherit ament

FILES_${PN} += "/opt/ros2/"
