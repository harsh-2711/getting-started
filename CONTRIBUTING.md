## Contributing Guidlines

This documentation contains a set of guidelines to help you during your contribution process. Please note that the following steps are designed to make the open source collaboration on this project much easier, hence they always needs to be followed. Thank you for helping out and remember, **no contribution is too small.**

### Step 0: Find an issue

- Take a look at the [Existing Issues](https://github.com/harsh-2711/getting-started/issues) or create your own [Issues](https://github.com/harsh-2711/getting-started/issues/new)!
- Wait for the Issue to be assigned to you after which you can start working on it.
- **Note : Every Pull Request in this project must have an associated Issue.**

### Step 1: Fork the project

- Fork this repository. This will create a local copy of this repository on your Github profile.
> Fork button is located at the top right corner on the project page

### Step 2: Clone the project

- Clone the copy of the project to your local machine.
```
$ git clone https://github.com/<username>/getting-started
```
Replace `<username>` with your GitHub username.

- Keep a reference to the original project in `upstream` remote.
```
$ git remote add upstream https://github.com/harsh-2711/getting-started
```
Run the above command from the cloned project's folder.
> This step will help you to update your copied project to get in sync with the original project.

- If you have already forked the project, update your copy before working.
```
$ git remote update
$ git checkout main
$ git rebase upstream/main
```

### Step 3: Create a branch
- Create a new branch each time while working on a new fix or adding a new feature.
```
$ git checkout -b branch_name
```
NOTE: Please refer to [Branch Naming Conventions](https://deepsource.io/blog/git-branch-naming-conventions/) before creating a new branch.

### Step 4: Work on the issue assigned
- Work on the issue(s) assigned to you.
- Add all the files/folders needed.
```
$ git add filename/folder
```
- If you want to add all your changes, use -
```
$ git add .
```
> Use `git status` command before adding all changes to prevent any unwanted additions.

### Step 5: Commit your work
- To commit your work, use -
```
$ git commit -m <commit_message>
```
NOTE: Please refer to [Semantic Commit Messages](https://seesparkbox.com/foundry/semantic_commit_messages) doc before writing your commit message.

### Step 6: Create a PR
- Once you have committed your work, push your changes to your remote repository.
```
git push -u origin <branch_name>
```

- After pushing your changes, navigate to your newly created branch on your forked project.
- Click on the `Pull Request` or `Compate & Pull Request` button (whichever you can find first 😅)

### Step 7: Reiterate
- Once you submit a Pull Request, wait for few days for the maintainer to take a look at it and suggest required changes (if any).
- Reiterate over your Pull Request and intergrate all the suggested changes.
- Once everything looks good, the maintainer will merge your Pull Request 🥳

## Need more help?🤔
You can refer to the following articles to learn basics of Git and Github and can also contact the project mentors, in case you are stuck:

- [How to create a Pull Request](https://www.atlassian.com/git/tutorials/making-a-pull-request)
- [How to solve merge conflicts](https://www.atlassian.com/git/tutorials/using-branches/merge-conflicts)
- [How to sync your project](https://www.atlassian.com/git/tutorials/syncing)
- [Learn GitHub from Scratch](https://lab.github.com/githubtraining/introduction-to-github)
