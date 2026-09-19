1. list sessions

``` shell
tmux ls
```

2. attach a session
``` shell
tmux attach -t 0
```

3. detach from within a session
`Control + b`, then `d`

4. rename a session
``` shell
tmux rename-session -t 0 download-aosp-source-code
```