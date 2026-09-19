# Introduction
Download aosp source code for branch "android-latest-release".

# Steps

1. change branch to "android-latest-release"
``` shell
# check the current branch
repo info


# change branch to "android-latest-release
repo init -b android-latest-release
```

2. sync the changes

``` shell
time repo sync -c -j$(nproc)
```