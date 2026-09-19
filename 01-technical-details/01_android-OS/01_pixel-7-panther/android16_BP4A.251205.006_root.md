# Introduction

## Step 1. Download the image zip of the phone Model


| **Field**                | **Value**       |
|:-------------------------|:----------------|
| **Phone model**          | Google Pixel 7  |
| **Current Build Number** | BP4A.251205.006 |


You can find the images [here](https://developers.google.com/android/images).



## Step 2. Install magisk
Download the [magisk](https://github.com/topjohnwu/Magisk) apk.

## Step 3. Get image file from zip

Unzip Factory Image zip file 
- "panther-bp4a.251205.006-factory-4455f800.zip" .

to get `init_boot.img` file

## Step 3. Magisk patch `init_boot.img`


## Step 4. flash rooted `init_boot.img` 

``` shell
# Reboot device into `bootloader` mode
adb reboot bootloader

# unlock the bootloader
fastboot flashing unlock

# flash init_boot image
fastboot flash init_boot ./magisk_patched-30600_B0vFm.img

# Reboot the device
fastboot reboot
```


## Step 5. check root permission

``` shell
adb shell
su
```




# Reference

1. [VIDEO][How-To Root the Google Pixel 9 & 9 Pro (Quick and Easy)!](https://www.youtube.com/watch?v=HG4hMT0l-Vs)