# personal-project-starter

## Reminders for Git

1. To add the repo to your computer, use the command "git clone <the copied link from github, and obvi without the arrows or quotations>"
2. To create your own branch, use the command "git checkout -b <name the branch what you want>"
3. After making changes in the code, type "git status" to see what needs to be added and what is good to go.
4. There are two ways to "stage" files to be committed (the first step):
  - For only one specific file: "git add <file name>"
  - For all of the files you've made changes to: "git add -A" (remember that capitalization is important!
5. After this, use command: git commit -m "write a detailed message of what has been changed"
  - Note that the -m "message" is required! don't forget that!
  - commit early and commit often! It's easier to restore back to smaller changes if something introduces a bug.
6. Run "git pull origin main" to merge in any new code and fix any merge conflicts
### Alex, want to add in any notes on stash?
7. Second to last step is to push to the top of your branch with: git push origin <branch name>
8. Go to github and create a pull request!

## Helpful links
- Home Brew git installation commands https://github.com/cli/cli#installation
- Home Brew https://brew.sh/
- Initial git configuration: https://git-scm.com/book/en/v2/Getting-Started-First-Time-Git-Setup
- Branching https://git-scm.com/book/en/v2/Git-Branching-Basic-Branching-and-Merging
- If you get this "error" "Please enter a commit message to explain why this merge is necessary" https://stackoverflow.com/questions/19085807/please-enter-a-commit-message-to-explain-why-this-merge-is-necessary-especially
