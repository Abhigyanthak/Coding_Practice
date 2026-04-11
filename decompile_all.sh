#!/bin/bash

cd /Users/abhigyan/Downloads/Coding_Practice/src

# Get list of .class files without corresponding .java files
for file in *.class; do
    basename="${file%.class}"
    if [ ! -f "${basename}.java" ]; then
        echo "Decompiling $file..."
        cfr-decompiler "$file" --outputdir . 2>&1 | grep -v "^$"
    fi
done

echo "Decompilation complete!"

