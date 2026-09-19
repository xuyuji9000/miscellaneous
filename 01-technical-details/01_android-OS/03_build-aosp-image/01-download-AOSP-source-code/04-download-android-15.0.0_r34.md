# Introduction
Download aosp source code for branch "android-15.0.0_r34".

Getting this branch, because latest downloadable proprietary driver.
is "[BP1A.250505.005.B1](https://developers.google.com/android/drivers#pantherbp1a.250505.005.b1)" .

and this BP1A.250505.005.B1 driver corresponds to "[android-15.0.0_r34](https://android.googlesource.com/platform/frameworks/base/+/refs/tags/android-15.0.0_r34)" branch.

# Steps

1. List available branches

``` shell
git ls-remote                                                   \
--heads https://android.googlesource.com/platform/manifest.git  \
| grep android-15
```

1. change branch to "android-15.0.0_r34"
``` shell
# check the current branch
repo info


# change branch to "android-15.0.0_r34"
time repo init -b android-15.0.0_r34
```

2. sync the changes

``` shell
time repo sync -c -j$(nproc)
```