#
# Git基础

1. Git installation

* Linux `sudo apt-get install git` `sudo yum install git`

* Windows [**https://git-for-windows.github.io**](https://git-for-windows.github.io/)

* Mac `brew install git`

2. Git与其他版本控制系统对待数据的方法的不同

* 其它版本控制系统
* 概念上来区分，其它大部分系统以文件变更列表的方式存储信息。 这类系统（CVS、Subversion等等）将它们保存的信息看作是一组基本文件和每个文件随时间逐步累积的差异。
![](/assets/比较差异.png)
* Git
* Git 不按照以上方式对待或保存数据。 反之，Git 更像是把数据看作是对小型文件系统的一组快照。 每次你提交更新，或在 Git 中保存项目状态时，它主要对当时的全部文件制作一个快照并保存这个快照的索引。 
![](/assets/记录快照.png)

3. Git的三种状态

* Git 有三种状态，你的文件可能处于其中之一：已提交（committed）、已修改（modified）和已暂存（staged）。
* Git 项目的三个工作区域的概念：Git 仓库、工作目录以及暂存区域。
* 基本的 Git 工作流程如下：
* 在工作目录中修改文件。
* 暂存文件，将文件的快照放入暂存区域。
* 提交更新，找到暂存区域的文件，将快照永久性存储到 Git 仓库目录。


