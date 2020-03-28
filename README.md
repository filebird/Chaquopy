GoldWindVane
============
GoldWindVane is developed AndroidUSBCamera based on the [jiangdongguo/AndroidUSBCamera](https://github.com/jiangdongguo/AndroidUSBCamera.git).

Use chaquopy to call python. You can refer to this code, write your own external camera video analysis application.Python writing analysis algorithm。

What to pay attention to:
===============================
build.gradle(app)

android {
    .........

        python {
            //Your Python installation directory
            buildPython "E:/Program Files/Python36/python.exe"
            //Your Python installation version
            buildPython "py -3.6"						
            pyc {
                src false
            }

            pip {
	    	//PIP installation of third-party libraries
//	    	install "numpy"
		//PIP installs third-party libraries, often with problems. 
		//You can download it to your local directory and install it in this way.
                install "e:/python/numpy-1.17.4-3-cp38-cp38-android_16_armeabi_v7a.whl"
                install "e:/python/matplotlib-3.1.2-1-cp38-cp38-android_16_armeabi_v7a.whl"
                install "e:/python/opencv_python-4.1.2.30-1-cp38-cp38-android_16_armeabi_v7a.whl"
                install "e:/python/pandas-0.25.3-1-cp38-cp38-android_16_armeabi_v7a.whl"
		//Chaquopy will automatically download some things.
		//If there is a problem, you can check the log, download and add by yourself.
                install "e:/python/chaquopy_openblas-0.2.20-5-py3-none-android_16_armeabi_v7a.whl"
                install "e:/python/chaquopy_freetype-2.9.1-1-py3-none-android_16_armeabi_v7a.whl"
                install "e:/python/python_dateutil-2.8.1-py2.py3-none-any.whl"
                //no need install lib.
//              install "math"
//              install "copy"

            }
        }
    }

License
-------
MIT License

Copyright (c) 2020 filebird

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
