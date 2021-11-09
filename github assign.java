SECTION 1:
1. 
Dell@DESKTOP-OGJS0HP MINGW64 ~
$ mkdir project_dir

Dell@DESKTOP-OGJS0HP MINGW64 ~
$ cd project_dir

2.
Dell@DESKTOP-OGJS0HP MINGW64 ~/project_dir
$ git init
Initialized empty Git repository in C:/Users/Dell/project_dir/.git/

3.
Dell@DESKTOP-OGJS0HP MINGW64 ~/project_dir (master)
$ touch index.html

4.
Dell@DESKTOP-OGJS0HP MINGW64 ~/project_dir (master)
$ git status
On branch master

No commits yet

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        index.html

nothing added to commit but untracked files present (use "git add" to track)

5.
Dell@DESKTOP-OGJS0HP MINGW64 ~/project_dir (master)
$ git add index.html

6.

Dell@DESKTOP-OGJS0HP MINGW64 ~/project_dir (master)
$ git commit -m "commiting html file called index"
[master (root-commit) cb025b4] commiting html file called index
 1 file changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 index.html

7.

Dell@DESKTOP-OGJS0HP MINGW64 ~/project_dir (master)
$ touch info.txt

8.
Dell@DESKTOP-OGJS0HP MINGW64 ~/project_dir (master)
$ git status
On branch master
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        modified:   index.html

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        info.txt

no changes added to commit (use "git add" and/or "git commit -a")

9.
Dell@DESKTOP-OGJS0HP MINGW64 ~/project_dir (master)
$ touch .gitignore

10.
Dell@DESKTOP-OGJS0HP MINGW64 ~/project_dir (master)
$ git status
On branch master
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        modified:   index.html

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        .gitignore

no changes added to commit (use "git add" and/or "git commit -a")

11.
Dell@DESKTOP-OGJS0HP MINGW64 ~/project_dir (master)
$ git add index.html

Dell@DESKTOP-OGJS0HP MINGW64 ~/project_dir (master)
$ git commit -m "commited index with <head>"
[master 783b30c] commited index with <head>
 1 file changed, 5 insertions(+)

12.
Dell@DESKTOP-OGJS0HP MINGW64 ~/project_dir (master)
$ git log
commit 783b30cf93f82b88a00c899e9d7f3c3f716f4009 (HEAD -> master)
Author: VegetaCR7 <rohansiddhesh@gmail.com>
Date:   Mon Oct 25 17:41:07 2021 +0530

    commited index with <head>

commit cb025b4dc10687798c6f68908f715d66d07f9331 (origin/master)
Author: VegetaCR7 <rohansiddhesh@gmail.com>
Date:   Mon Oct 25 17:30:47 2021 +0530

    commiting html file called index

13.
14.
Dell@DESKTOP-OGJS0HP MINGW64 ~/project_dir (master)
$ git checkout -- .

15.
16.
Dell@DESKTOP-OGJS0HP MINGW64 ~/project_dir (master)
$ git add index.html

Dell@DESKTOP-OGJS0HP MINGW64 ~/project_dir (master)
$ git status
On branch master
Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
        modified:   index.html

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        .gitignore


17.
Dell@DESKTOP-OGJS0HP MINGW64 ~/project_dir (master)
$ git restore --staged index.html

Dell@DESKTOP-OGJS0HP MINGW64 ~/project_dir (master)
$ git status
On branch master
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        modified:   index.html

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        .gitignore

no changes added to commit (use "git add" and/or "git commit -a")

18.
Dell@DESKTOP-OGJS0HP MINGW64 ~/project_dir (master)
$ git config --global alias.my-add add

19.
Dell@DESKTOP-OGJS0HP MINGW64 ~/project_dir (master)
$ git my-add index.html

Dell@DESKTOP-OGJS0HP MINGW64 ~/project_dir (master)
$ git commit -m "commited index.html acc to steps"
[master 30832b3] commited index.html acc to steps
 1 file changed, 3 insertions(+)

Dell@DESKTOP-OGJS0HP MINGW64 ~/project_dir (master)
$ git status
On branch master
Untracked files:
  (use "git add <file>..." to include in what will be committed)
        .gitignore

nothing added to commit but untracked files present (use "git add" to track)

20.
Dell@DESKTOP-OGJS0HP MINGW64 ~/project_dir (master)
$ git log
commit 30832b3cfdac924387451a43448dffb891e3f359 (HEAD -> master)
Author: VegetaCR7 <rohansiddhesh@gmail.com>
Date:   Mon Oct 25 18:48:02 2021 +0530

    commited index.html acc to steps

commit 783b30cf93f82b88a00c899e9d7f3c3f716f4009
Author: VegetaCR7 <rohansiddhesh@gmail.com>
Date:   Mon Oct 25 17:41:07 2021 +0530

    commited index with <head>

commit cb025b4dc10687798c6f68908f715d66d07f9331 (origin/master)
Author: VegetaCR7 <rohansiddhesh@gmail.com>
Date:   Mon Oct 25 17:30:47 2021 +0530

    commiting html file called index

Dell@DESKTOP-OGJS0HP MINGW64 ~/project_dir (master)
$ git revert 30832b3cfdac924387451a43448dffb891e3f359
[master dfcfe81] Revert "commited index.html acc to steps"
 1 file changed, 3 deletions(-)

SECTION 02: 
1.
Dell@DESKTOP-OGJS0HP MINGW64 ~
$ mkdir Assignments

Dell@DESKTOP-OGJS0HP MINGW64 ~
$ cd Assignments


3.
Dell@DESKTOP-OGJS0HP MINGW64 ~/Assignments (master)
$ touch README.txt

4.
Dell@DESKTOP-OGJS0HP MINGW64 ~/Assignments (master)
$ git add .

Dell@DESKTOP-OGJS0HP MINGW64 ~/Assignments (master)
$ git commit -m "committed readme"
[master (root-commit) 5307573] committed readme
 1 file changed, 2 insertions(+)
 create mode 100644 README.txt

5.
Dell@DESKTOP-OGJS0HP MINGW64 ~/Assignments (master)
$ git branch html-assignments

6.
Dell@DESKTOP-OGJS0HP MINGW64 ~/Assignments (master)
$ git checkout html-assignments
Switched to branch 'html-assignments'

8,9,10.
Dell@DESKTOP-OGJS0HP MINGW64 ~/Assignments (html-assignments)
$ git add .

Dell@DESKTOP-OGJS0HP MINGW64 ~/Assignments (html-assignments)
$ git commit -m "modified html"
[html-assignments 0096afe] modified html
 1 file changed, 9 insertions(+)
 create mode 100644 Anime.html

11.
Dell@DESKTOP-OGJS0HP MINGW64 ~/Assignments (html-assignments)
$ git checkout master
Switched to branch 'master'

12.
Dell@DESKTOP-OGJS0HP MINGW64 ~/Assignments (master)
$ git add .

Dell@DESKTOP-OGJS0HP MINGW64 ~/Assignments (master)
$ git commit -m "modified txt"
[master 1a2a96b] modified txt
 1 file changed, 2 insertions(+), 1 deletion(-)

13.
Dell@DESKTOP-OGJS0HP MINGW64 ~/Assignments (master)
$ git checkout html-assignments
Switched to branch 'html-assignments'

14,15.
Dell@DESKTOP-OGJS0HP MINGW64 ~/Assignments (html-assignments)
$ git add .

Dell@DESKTOP-OGJS0HP MINGW64 ~/Assignments (html-assignments)
$ git commit -m "modified html 2nd time"
[html-assignments 8babf5e] modified html 2nd time
 1 file changed, 1 insertion(+)

16.
Dell@DESKTOP-OGJS0HP MINGW64 ~/Assignments (html-assignments)
$ git checkout master
Switched to branch 'master'

17.
Dell@DESKTOP-OGJS0HP MINGW64 ~/Assignments (master)
$ git merge html-assignments
Merge made by the 'recursive' strategy.
 Anime.html | 10 ++++++++++
 1 file changed, 10 insertions(+)
 create mode 100644 Anime.html

18.
Dell@DESKTOP-OGJS0HP MINGW64 ~/Assignments (master)
$ git branch -D html-assignments
Deleted branch html-assignments (was 8babf5e).

SECTION 02: --------


1.
Dell@DESKTOP-OGJS0HP MINGW64 ~/Assignments (master)
$ git branch css-assignments

2.
$ git checkout css-assignments
Switched to branch 'css-assignments'
M       Anime.html

3,4.
Dell@DESKTOP-OGJS0HP MINGW64 ~/Assignments (css-assignments)
$ git add .

Dell@DESKTOP-OGJS0HP MINGW64 ~/Assignments (css-assignments)
$ git commit -m "inittial css commit"
[css-assignments 5e7ffb2] inittial css commit
 2 files changed, 7 insertions(+), 1 deletion(-)
 create mode 100644 anistyle.css

Dell@DESKTOP-OGJS0HP MINGW64 ~/Assignments (css-assignments)
$ ls
Anime.html  README.txt  anistyle.css
5,6.
Dell@DESKTOP-OGJS0HP MINGW64 ~/Assignments (css-assignments)
$ git add .

Dell@DESKTOP-OGJS0HP MINGW64 ~/Assignments (css-assignments)
$ git commit -m "change in readme txt file"
[css-assignments 9ad1781] change in readme txt file
 1 file changed, 2 insertions(+), 2 deletions(-)

7.
Dell@DESKTOP-OGJS0HP MINGW64 ~/Assignments (css-assignments)
$ git checkout master
Switched to branch 'master'

8.
Dell@DESKTOP-OGJS0HP MINGW64 ~/Assignments (master)
$ git add .

Dell@DESKTOP-OGJS0HP MINGW64 ~/Assignments (master)
$ git commit -m "change in readme txt file in master"
[master 070d854] change in readme txt file in master
 1 file changed, 2 insertions(+), 1 deletion(-)

9.
Dell@DESKTOP-OGJS0HP MINGW64 ~/Assignments (master)
$ git checkout css-assignments
Switched to branch 'css-assignments'

10,11.
Dell@DESKTOP-OGJS0HP MINGW64 ~/Assignments (css-assignments)
$ git add .

Dell@DESKTOP-OGJS0HP MINGW64 ~/Assignments (css-assignments)
$ git commit -m "minor css commit"
[css-assignments 935a8cd] minor css commit
 1 file changed, 4 insertions(+)

12.
Dell@DESKTOP-OGJS0HP MINGW64 ~/Assignments (css-assignments)
$ git checkout master
Switched to branch 'master'

13.
Dell@DESKTOP-OGJS0HP MINGW64 ~/Assignments (master|MERGING)
$ git add .

Dell@DESKTOP-OGJS0HP MINGW64 ~/Assignments (master|MERGING)
$ git commit -m "commit manually resolve merge"
[master 15f0192] commit manually resolve merge

Dell@DESKTOP-OGJS0HP MINGW64 ~/Assignments (master)
$ git status
On branch master
nothing to commit, working tree clean

Dell@DESKTOP-OGJS0HP MINGW64 ~/Assignments (master)
$ git merge css-assignments
Already up to date.

14.
Dell@DESKTOP-OGJS0HP MINGW64 ~/Assignments (master)
$ git branch -D css-assignments
Deleted branch css-assignments (was 935a8cd).

SECTION 03: --------

1.
Dell@DESKTOP-OGJS0HP MINGW64 ~/Assignments (master)
$ git branch js-assignments

2.
Dell@DESKTOP-OGJS0HP MINGW64 ~/Assignments (master)
$ git checkout js-assignments
Switched to branch 'js-assignments'
M       Anime.html


3,4.
Dell@DESKTOP-OGJS0HP MINGW64 ~/Assignments (js-assignments)
$ git add .

Dell@DESKTOP-OGJS0HP MINGW64 ~/Assignments (js-assignments)
$ git commit -m "initial commit in branch"
[js-assignments 231a4dd] initial commit in branch
 2 files changed, 3 insertions(+), 2 deletions(-)
 create mode 100644 jsFile.txt

5,6.
Dell@DESKTOP-OGJS0HP MINGW64 ~/Assignments (js-assignments)
$ git add .

Dell@DESKTOP-OGJS0HP MINGW64 ~/Assignments (js-assignments)
$ git commit -m "committed changes in readme of branch"
[js-assignments 5238742] committed changes in readme of branch
 1 file changed, 1 insertion(+), 1 deletion(-)

7.
Dell@DESKTOP-OGJS0HP MINGW64 ~/Assignments (js-assignments)
$ git checkout master
Switched to branch 'master'

8.
Dell@DESKTOP-OGJS0HP MINGW64 ~/Assignments (master)
$ git add .

Dell@DESKTOP-OGJS0HP MINGW64 ~/Assignments (master)
$ git commit -m "committed changes in readme of master"
[master 10e7559] committed changes in readme of master
 1 file changed, 1 insertion(+), 1 deletion(-)

9.
Dell@DESKTOP-OGJS0HP MINGW64 ~/Assignments (master)
$ git checkout js-assignments
Switched to branch 'js-assignments'

10,11.
Dell@DESKTOP-OGJS0HP MINGW64 ~/Assignments (js-assignments)
$ git add .

Dell@DESKTOP-OGJS0HP MINGW64 ~/Assignments (js-assignments)
$ git commit -m "commit changes in js file of branch"
[js-assignments 588d293] commit changes in js file of branch
 1 file changed, 2 insertions(+), 1 deletion(-)

12.
Dell@DESKTOP-OGJS0HP MINGW64 ~/Assignments (js-assignments)
$ git checkout master
Switched to branch 'master'

13.
Dell@DESKTOP-OGJS0HP MINGW64 ~/Assignments (master)
$ git merge js-assignments
Auto-merging README.txt
CONFLICT (content): Merge conflict in README.txt
Automatic merge failed; fix conflicts and then commit the result.

Dell@DESKTOP-OGJS0HP MINGW64 ~/Assignments (master|MERGING)
$ git add .

Dell@DESKTOP-OGJS0HP MINGW64 ~/Assignments (master|MERGING)
$ git commit -m "commit manually resolve merge"
[master d74f5cb] commit manually resolve merge

Dell@DESKTOP-OGJS0HP MINGW64 ~/Assignments (master)
$ git merge js-assignments
Already up to date.

14.
Dell@DESKTOP-OGJS0HP MINGW64 ~/Assignments (master)
$ git branch -D js-assignments
Deleted branch js-assignments (was 588d293).




