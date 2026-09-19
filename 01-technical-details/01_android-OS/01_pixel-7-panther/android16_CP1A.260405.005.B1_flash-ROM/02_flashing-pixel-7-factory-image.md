The most reliable way to flash an official Google factory image onto a Pixel 7 (codename "panther") is using the manual `fastboot` method via your terminal.

This is what the bootloader interface will look like when you successfully bridge the connection to your machine. You will need to monitor the green/red **Device state** indicator near the bottom of this screen during the unlock step.

---

1. **Enable OEM Unlocking:** Prerequisite.
Go to **Settings > About phone** and tap **Build number** 7 times. Go back to **Settings > System > Developer options** and toggle on both **OEM unlocking** and **USB debugging**.
*Verification: Both toggles remain green and active when you exit and re-enter the menu.*


2. **Download the Factory Image:**
Download the latest factory image for the Pixel 7 ("panther") from the official Google Factory Images repository and extract the downloaded `.zip` archive.
*Verification: You should see a `flash-all.sh` file inside the newly extracted directory.*


3. **Boot into Fastboot Mode:**
Connect the phone via USB and run `adb reboot bootloader` in your terminal.
*Verification: Your phone will reboot to the black fastboot screen shown in the image above.*


4. **Unlock the Bootloader:**
Run `fastboot flashing unlock` in your terminal. Use the physical volume keys on the phone to select "Unlock the bootloader" and press the power button to confirm.
*Verification: The "Device state" text on the phone's screen will change to red and read "unlocked".*


5. **Execute the Flash Script:**
In your terminal, navigate into the extracted factory image folder and execute `./flash-all.sh`. Do not disconnect the cable while the partitions are being written.
*Verification: The terminal will output continuous flashing progress, and the device will automatically reboot into the fresh OS setup screen upon completion.*