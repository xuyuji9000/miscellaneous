1. list block devices

``` shell
lsblk 
# NAME        MAJ:MIN RM   SIZE RO TYPE MOUNTPOINTS
# nvme0n1     259:0    0  1000G  0 disk 
# ├─nvme0n1p1 259:1    0     1M  0 part 
# ├─nvme0n1p2 259:2    0   200M  0 part /boot/efi
# └─nvme0n1p3 259:3    0 400.8G  0 part /
```

2. extend partition ot fill available space
``` shell
sudo growpart /dev/nvme0n1 3
```

3. extend filesystem

``` shell
sudo resize2fs /dev/nvme0n1p3
```