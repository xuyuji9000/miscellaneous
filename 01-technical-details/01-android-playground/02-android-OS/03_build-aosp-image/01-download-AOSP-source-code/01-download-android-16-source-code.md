1. prepare a directory to hold source code

``` shell
mkdir aosp
cd aosp/
```

2. List android-16 branches

``` shell
git ls-remote                                                   \
--heads https://android.googlesource.com/platform/manifest.git  \
| grep android-16

# As 2025-12-24, the latest branch I found for Android 16
# was "android-16.0.0_r4"
```

3. Source Code download preparation

``` shell
time repo init                                          \
-u https://android.googlesource.com/platform/manifest   \
-b android-16.0.0_r4

# check the current branch
repo info
```

4. download AOSP source code
``` shell
# check current CPU count
# 2
nproc

time repo sync -c -j2
```