#
# Git 命令

* `git config` 用来帮助设置控制 Git 外观和行为的配置变量。

* `--system` 配置系统上每一个用户及他们仓库的通用配置
* `--global` 配置当前用户配置
* `无参` 配置当前库

```
git config --global user.name "liuxiaokun"
git config --global user.email liuxiaokun@lvmama.com
git config --list
git config user.name
git config --global core.editor emacs
```

* 获取帮助

```
git help config
```

* 获取** Git **仓库

* `git init` 在现有目录中初始化仓库
* `git clone git@github.com:git/git.git git` 克隆现有的仓库

* 检查当前文件状态

* git status

* 忽略文件（.gitignore）

* \*.\[oa\]
* \*~
* 匹配模式可以以（/）开头防止递归， 匹配模式可以以（/）结尾指定目录。
* 要忽略指定模式以外的文件或目录，可以在模式前加上惊叹号（!）取反。
* ![](/assets/gitignore.png)
* 详细的gitignore列表 [https://github.com/github/gitignore](https://github.com/github/gitignore)

* 比较差异

* git diff file
* git diff --staged file
* git diff commit-id1 commit-id2 -- file

* 提交到本地库

* git commit -m"xx"
* git commit -am"xxx"

* 移除文件
* git rm --cached
* 移动文件
* git mv from to
* 查看提交历史
* git log
* -n 最近n次提交
* -p 显示每次提交的内容差异
* --stat 每次提交的简略的统计信息
* --pretty 格式化常用的oneline
* --grep 过滤comment信息
* --committer
* 撤消操作
* git commit --amend
* git reset HEAD file 取消暂存的文件
* git checkout -- file 你对那个文件做的任何修改都会消失
* 版本回退
* git reset --hard HEAD^ 上一个版本
* git reset --hard 3628164 根据commit id 回退
* git reset --hard HEAD~100 回退到上100个版本
* 远程仓库
* git remote -v 列出远程仓库信息
* git remote add shortname url 添加远程仓库
* git fetch shortname 远程仓库抓取与拉取
* git push origin master 推送到远程仓库
* git remote show origin 查看远程仓库
* git remote rename oldname newname 远程仓库重命名
* git remote rm shortname 删除远程仓库
* 标签
* git tag 列出标签
* git tag -l 'v1.8.5\*' 通配符列出关于v1.8.5
* git tag tagname 创建标签，默认是打在最新提交的commit上
* git tag v0.9 6224937 打在commit id 为6224937的提交上
* git tag -d tagname 删除本地tag
* git push origin :refs/tags/tagname 删除远程tag
* 别名
* git config --global alias.st status
* 分支
* git branch newBranch 创建分支
* git checkout test 切换到一个已经存在的分支
* git checkout -b test 新建并切换
* git branch -d test 删除分支
* git branch 分支列表
* git branch -v 查看每一个分支的最后一次提交


