SHELL := /bin/bash

#
# 为什么用 Makefile (Windows 系统需要下载 make.exe)
# 1.方便处理跨平台脚本问题
# 1.1.Windows - *.cmd|*.bat|...
# 1.2.Linux - *.sh...
# 2.简化输入 -> 隐藏长命令
#

# 默认使用 mvn, 如果 MVND_HOME 环境变量存在, 则使用 mvnd
MVN ?= $(if $(MVND_HOME),mvnd,mvn)

.PHONY: clean compile test deploy package tree check

# 设置默认目标
.DEFAULT_GOAL := help

# 打印当前目录
dir:
	@echo "Current directory: $(CURDIR)"

# 清理项目
clean: dir
	@echo "Cleaning the project..."
	$(MVN) clean

# 编译项目
compile: clean
	@echo "Using $(MVN) to compile the project..."
	$(MVN) compile

# 运行测试
test: clean
	@echo "Using $(MVN) to test the project..."
	$(MVN) test

# 部署项目
# 通常是部署到私服(开源项目可部署到中央仓库)
deploy: clean
	@echo "Using $(MVN) to deploy the project..."
	$(MVN) -DskipTests=true source:jar deploy

# 打包项目
package: clean
	@echo "Using $(MVN) to package the project..."
	$(MVN) -DskipTests=true package

# 查看依赖树
tree:
	@echo "Using $(MVN) to show dependency tree..."
	$(MVN) dependency:tree -Dincludes=$(filter-out $@,$(MAKECMDGOALS))

# 代码检查
check:
	@echo "Using $(MVN) to check the project..."
	$(MVN) checkstyle:check

# 帮助信息
help:
	@echo "Available targets:"
	@echo "  clean     - Clean the project"
	@echo "  compile   - Compile the project"
	@echo "  test      - Run tests"
	@echo "  deploy    - Deploy the project"
	@echo "  package   - Package the project"
	@echo "  tree      - Show dependency tree (e.g., make tree group:artifact)"
	@echo "  check     - Check the project"
	@echo "  help      - Show this help message"

# 处理未知目标
%:
	@echo "Unknown target: $@"
	@echo "Use 'make help' to see available targets."
