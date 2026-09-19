# Introduction
Build aosp 15 with branch 'android-15.0.0_r34' source code \
for google pixel 7.


# Steps


1. Obtain Proprietary Binaries
Download [BP1A.250505.005.B1](https://developers.google.com/android/drivers#pantherbp1a.250505.005.b1) .

2. Prepare Build machine

- CPU     : 32 core
- Memory  : 128GB
- Storage : 1TB

Estimated Build Time: 45 to 65 minutes

3. Relax AppArmor kernel restrictions
``` shell
# 1. Disable the general AppArmor restriction on user namespaces
sudo sysctl -w kernel.apparmor_restrict_unprivileged_userns=0

# 2. Disable the restriction specifically for unconfined processes
sudo sysctl -w kernel.apparmor_restrict_unprivileged_unconfined=0
```

4. The Fix: Clone the Kernel Prebuilts
``` shell
repo sync -c -j$(nproc) device/google/pantah-kernels/6.1/
ln -s 25Q1-13202328 trunk-12709428
```

5. Build the Image
Initialize the environment and select the Pixel 7 target.
``` shell
source build/envsetup.sh
lunch aosp_panther-trunk_staging-userdebug
time m -j$(nproc)
```

