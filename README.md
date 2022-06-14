# Panama in action: Game of Life rendered with X11

[![Apache 2.0](https://img.shields.io/github/license/nebula-plugins/nebula-project-plugin.svg)](http://www.apache.org/licenses/LICENSE-2.0)

Inspired by [Game of Life CSP](https://github.com/ebarlas/game-of-life-csp)

**Requires Java 18**

Best bet is to run on Linux for X11.

## Run

Point JAVA_HOME to Java 18.

```shell
export JAVA_HOME=...jdk-18...
```

JavaFX version

```shell
mvn javafx:run
```

X11 version

```shell
# path to libX11.so (Ubuntu in this example)
export LD_LIBRARY_PATH=/usr/lib/x86_64-linux-gnu

mvn exec:exec
```

## Patterns

The resources/.../patterns directory contains text-encoded patterns copied from [Game of Life CSP](https://github.com/ebarlas/game-of-life-csp), which copied from 
[Life Lexicon](https://people.sc.fsu.edu/~jburkardt/m_src/exm/lexicon.txt) (© Stephen Silver, 1997-2005).

The default pattern is `gosper_glider_gun`. See the `pattern` property at the top of the pom file.
