package models

import sys.process._

/**
  * Created by Tom on 11/5/16.
  */
class NAStyDrive(val logLevel: String = "debug") {
  /*
  The Drive class is the primary class for I/O to the NAS drive
  Params:
    logLevel [String]: available choices ["debug"], defaults to "debug"
  Returns:
    Drive object
   */
  var diskPath: String = "/media/usb/"  // Current path in disk
  var mounted: Boolean = false   // Boolean if disk currently mounted

  def listDisks(): List[String] = {
    /*
    Gets the list of drives connected and returns it
    Returns:
      List[String]: list of of disks available on device
     */
    val d_list: String = "fdisk -l" #| "grep sda*" !!;
    val out_list: List[String] = d_list.split("\n").toList
    val out: List[String] = out_list.slice(1, out_list.length).map(str => str.split(" ")(0))
    out
  }
  def mountDisk(disk: String): Int = {
    /*
    Mounts disk to device
    Params:
      disk [String]: name of disk to mount
    Returns:
      Int: return 0 on success and -1 on failure
     */
    val made_dir: Int = "mkdir /media/usb" !;
    if (made_dir == 0) {
      val mountSuccess: Int = s"mount ${disk} /media/usb" !;
      if (mountSuccess == 0) {
        this.mounted = true
        mountSuccess
      } else -1
    } else -1
  }
  def ll(args: String = ""): List[String] = {
    /*
    Performs "ll" on current diskPath
    Params:
      args [String]: list of additional arguments for "ls -l" command
    Return:
      List[String]: list of things in diskPath
     */
    val ll_str: String = s"ls -l${args} ${this.diskPath}" !!;
    if (this.mounted) ll_str.split("\n").toList else List("")
  }
  def ls(args: String = ""): List[String] = {
    /*
    Outputs "ls" command as list of strings
    Params:
      args [String]: String with additional arguments for "ls" command
    Returns:
      List[String]: list of items in diskPath as if it was from the "ls" command
     */
    val ll_list: List[String] = this.ll(args)
    val ls_list: List[String] = ll_list.map(str => str.split(" ").slice(8, str.split(" ").length).mkString(" "))
    ls_list
  }
  def cd(dir: String): Int = {
    /*
    Changes the diskPath to the dir argument
    Params:
      dir [String]: directory name to cd to
    Returns:
      Int: 0 for success or -1 for failure
     */
    if (this.ls().contains(dir) && this.ll()(0).contains("d")) {
      diskPath = dir
      0
    } else -1
  }
  def copyToDisk(infpath: String, outpath: String = this.diskPath): Int = {
    /*
    Params:
      infpath [String]: path to file to be copied to disk
      outpath [String]: path in disk to save file, defaults to diskPath if no second argument given
    Returns:
      Int: 0 on success, -1 on failure
     */
    val good_infpath: Int = s"cat ${infpath}" !;
    if (this.mounted && good_infpath == 0) s"cp ${infpath} ${outpath}" ! else -1
  }
  def copyFromDisk(infpath: String, outpath: String): Int = {
    /*
    Copies a file from a disk to a different location
    Params:
      infpath [String]: path to disk file to be copied
      outpath [String]: path to copy disk file to
    Returns:
      Int: 0 on success, -1 otherwise
     */
    val good_infpath: Int = s"cat ${infpath}" !;
    if (this.mounted && good_infpath == 0) s"cp ${infpath} ${outpath}" ! else -1
  }
  def removeFromDisk(fpath: String): Int = {
    /*
    Removes a file path from disk
    Params:
      fpath [String]: path to file/dir to be deleted from disk
    Returns:
      Int: 0 for success, -1 for failure
     */
    val cat_results: String = s"cat ${fpath}" !!;
    if (cat_results.contains("Is a directory")) s"rm -rf ${fpath}" ! else s"rm -f ${fpath}" !;
  }
}

