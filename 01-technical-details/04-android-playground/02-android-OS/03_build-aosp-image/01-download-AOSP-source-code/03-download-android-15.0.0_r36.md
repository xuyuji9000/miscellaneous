# Introduction
Download aosp source code for branch "android-15".

# Steps

1. List available branches

``` shell
git ls-remote                                                   \
--heads https://android.googlesource.com/platform/manifest.git  \
| grep android-15
```

1. change branch to "android-15.0.0_r36"
``` shell
# check the current branch
repo info


# change branch to "android-15.0.0_r36"
time repo init -b android-15.0.0_r36
```

2. sync the changes

``` shell
time repo sync -c -j$(nproc)
```