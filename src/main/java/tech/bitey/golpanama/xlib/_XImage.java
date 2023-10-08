// Generated by jextract

package tech.bitey.golpanama.xlib;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _XImage {
 *     int width;
 *     int height;
 *     int xoffset;
 *     int format;
 *     char* data;
 *     int byte_order;
 *     int bitmap_unit;
 *     int bitmap_bit_order;
 *     int bitmap_pad;
 *     int depth;
 *     int bytes_per_line;
 *     int bits_per_pixel;
 *     unsigned long red_mask;
 *     unsigned long green_mask;
 *     unsigned long blue_mask;
 *     XPointer obdata;
 *     struct funcs f;
 * };
 * }
 */
public class _XImage {

    public static MemoryLayout $LAYOUT() {
        return constants$32.const$0;
    }
    public static VarHandle width$VH() {
        return constants$32.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int width;
     * }
     */
    public static int width$get(MemorySegment seg) {
        return (int)constants$32.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int width;
     * }
     */
    public static void width$set(MemorySegment seg, int x) {
        constants$32.const$1.set(seg, x);
    }
    public static int width$get(MemorySegment seg, long index) {
        return (int)constants$32.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void width$set(MemorySegment seg, long index, int x) {
        constants$32.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle height$VH() {
        return constants$32.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int height;
     * }
     */
    public static int height$get(MemorySegment seg) {
        return (int)constants$32.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int height;
     * }
     */
    public static void height$set(MemorySegment seg, int x) {
        constants$32.const$2.set(seg, x);
    }
    public static int height$get(MemorySegment seg, long index) {
        return (int)constants$32.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void height$set(MemorySegment seg, long index, int x) {
        constants$32.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle xoffset$VH() {
        return constants$32.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int xoffset;
     * }
     */
    public static int xoffset$get(MemorySegment seg) {
        return (int)constants$32.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int xoffset;
     * }
     */
    public static void xoffset$set(MemorySegment seg, int x) {
        constants$32.const$3.set(seg, x);
    }
    public static int xoffset$get(MemorySegment seg, long index) {
        return (int)constants$32.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void xoffset$set(MemorySegment seg, long index, int x) {
        constants$32.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle format$VH() {
        return constants$32.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int format;
     * }
     */
    public static int format$get(MemorySegment seg) {
        return (int)constants$32.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int format;
     * }
     */
    public static void format$set(MemorySegment seg, int x) {
        constants$32.const$4.set(seg, x);
    }
    public static int format$get(MemorySegment seg, long index) {
        return (int)constants$32.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void format$set(MemorySegment seg, long index, int x) {
        constants$32.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle data$VH() {
        return constants$32.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* data;
     * }
     */
    public static MemorySegment data$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$32.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* data;
     * }
     */
    public static void data$set(MemorySegment seg, MemorySegment x) {
        constants$32.const$5.set(seg, x);
    }
    public static MemorySegment data$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$32.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void data$set(MemorySegment seg, long index, MemorySegment x) {
        constants$32.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle byte_order$VH() {
        return constants$33.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int byte_order;
     * }
     */
    public static int byte_order$get(MemorySegment seg) {
        return (int)constants$33.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int byte_order;
     * }
     */
    public static void byte_order$set(MemorySegment seg, int x) {
        constants$33.const$0.set(seg, x);
    }
    public static int byte_order$get(MemorySegment seg, long index) {
        return (int)constants$33.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void byte_order$set(MemorySegment seg, long index, int x) {
        constants$33.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle bitmap_unit$VH() {
        return constants$33.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int bitmap_unit;
     * }
     */
    public static int bitmap_unit$get(MemorySegment seg) {
        return (int)constants$33.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int bitmap_unit;
     * }
     */
    public static void bitmap_unit$set(MemorySegment seg, int x) {
        constants$33.const$1.set(seg, x);
    }
    public static int bitmap_unit$get(MemorySegment seg, long index) {
        return (int)constants$33.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void bitmap_unit$set(MemorySegment seg, long index, int x) {
        constants$33.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle bitmap_bit_order$VH() {
        return constants$33.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int bitmap_bit_order;
     * }
     */
    public static int bitmap_bit_order$get(MemorySegment seg) {
        return (int)constants$33.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int bitmap_bit_order;
     * }
     */
    public static void bitmap_bit_order$set(MemorySegment seg, int x) {
        constants$33.const$2.set(seg, x);
    }
    public static int bitmap_bit_order$get(MemorySegment seg, long index) {
        return (int)constants$33.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void bitmap_bit_order$set(MemorySegment seg, long index, int x) {
        constants$33.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle bitmap_pad$VH() {
        return constants$33.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int bitmap_pad;
     * }
     */
    public static int bitmap_pad$get(MemorySegment seg) {
        return (int)constants$33.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int bitmap_pad;
     * }
     */
    public static void bitmap_pad$set(MemorySegment seg, int x) {
        constants$33.const$3.set(seg, x);
    }
    public static int bitmap_pad$get(MemorySegment seg, long index) {
        return (int)constants$33.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void bitmap_pad$set(MemorySegment seg, long index, int x) {
        constants$33.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle depth$VH() {
        return constants$33.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int depth;
     * }
     */
    public static int depth$get(MemorySegment seg) {
        return (int)constants$33.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int depth;
     * }
     */
    public static void depth$set(MemorySegment seg, int x) {
        constants$33.const$4.set(seg, x);
    }
    public static int depth$get(MemorySegment seg, long index) {
        return (int)constants$33.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void depth$set(MemorySegment seg, long index, int x) {
        constants$33.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle bytes_per_line$VH() {
        return constants$33.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int bytes_per_line;
     * }
     */
    public static int bytes_per_line$get(MemorySegment seg) {
        return (int)constants$33.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int bytes_per_line;
     * }
     */
    public static void bytes_per_line$set(MemorySegment seg, int x) {
        constants$33.const$5.set(seg, x);
    }
    public static int bytes_per_line$get(MemorySegment seg, long index) {
        return (int)constants$33.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void bytes_per_line$set(MemorySegment seg, long index, int x) {
        constants$33.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle bits_per_pixel$VH() {
        return constants$34.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int bits_per_pixel;
     * }
     */
    public static int bits_per_pixel$get(MemorySegment seg) {
        return (int)constants$34.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int bits_per_pixel;
     * }
     */
    public static void bits_per_pixel$set(MemorySegment seg, int x) {
        constants$34.const$0.set(seg, x);
    }
    public static int bits_per_pixel$get(MemorySegment seg, long index) {
        return (int)constants$34.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void bits_per_pixel$set(MemorySegment seg, long index, int x) {
        constants$34.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle red_mask$VH() {
        return constants$34.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long red_mask;
     * }
     */
    public static long red_mask$get(MemorySegment seg) {
        return (long)constants$34.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long red_mask;
     * }
     */
    public static void red_mask$set(MemorySegment seg, long x) {
        constants$34.const$1.set(seg, x);
    }
    public static long red_mask$get(MemorySegment seg, long index) {
        return (long)constants$34.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void red_mask$set(MemorySegment seg, long index, long x) {
        constants$34.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle green_mask$VH() {
        return constants$34.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long green_mask;
     * }
     */
    public static long green_mask$get(MemorySegment seg) {
        return (long)constants$34.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long green_mask;
     * }
     */
    public static void green_mask$set(MemorySegment seg, long x) {
        constants$34.const$2.set(seg, x);
    }
    public static long green_mask$get(MemorySegment seg, long index) {
        return (long)constants$34.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void green_mask$set(MemorySegment seg, long index, long x) {
        constants$34.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle blue_mask$VH() {
        return constants$34.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long blue_mask;
     * }
     */
    public static long blue_mask$get(MemorySegment seg) {
        return (long)constants$34.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long blue_mask;
     * }
     */
    public static void blue_mask$set(MemorySegment seg, long x) {
        constants$34.const$3.set(seg, x);
    }
    public static long blue_mask$get(MemorySegment seg, long index) {
        return (long)constants$34.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void blue_mask$set(MemorySegment seg, long index, long x) {
        constants$34.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle obdata$VH() {
        return constants$34.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * XPointer obdata;
     * }
     */
    public static MemorySegment obdata$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$34.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * XPointer obdata;
     * }
     */
    public static void obdata$set(MemorySegment seg, MemorySegment x) {
        constants$34.const$4.set(seg, x);
    }
    public static MemorySegment obdata$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$34.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void obdata$set(MemorySegment seg, long index, MemorySegment x) {
        constants$34.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    /**
     * {@snippet :
     * struct funcs {
     *     struct _XImage* (*create_image)(struct _XDisplay*,Visual*,unsigned int,int,int,char*,unsigned int,unsigned int,int,int);
     *     int (*destroy_image)(struct _XImage*);
     *     unsigned long (*get_pixel)(struct _XImage*,int,int);
     *     int (*put_pixel)(struct _XImage*,int,int,unsigned long);
     *     struct _XImage* (*sub_image)(struct _XImage*,int,int,unsigned int,unsigned int);
     *     int (*add_pixel)(struct _XImage*,long);
     * };
     * }
     */
    public static final class funcs {

        // Suppresses default constructor, ensuring non-instantiability.
        private funcs() {}
        public static MemoryLayout $LAYOUT() {
            return constants$34.const$5;
        }
        /**
         * {@snippet :
 * struct _XImage* (*create_image)(struct _XDisplay*,Visual*,unsigned int,int,int,char*,unsigned int,unsigned int,int,int);
         * }
         */
        public interface create_image {

            java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, int _x2, int _x3, int _x4, java.lang.foreign.MemorySegment _x5, int _x6, int _x7, int _x8, int _x9);
            static MemorySegment allocate(create_image fi, Arena scope) {
                return RuntimeHelper.upcallStub(constants$35.const$1, fi, constants$35.const$0, scope);
            }
            static create_image ofAddress(MemorySegment addr, Arena arena) {
                MemorySegment symbol = addr.reinterpret(arena, null);
                return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, int __x2, int __x3, int __x4, java.lang.foreign.MemorySegment __x5, int __x6, int __x7, int __x8, int __x9) -> {
                    try {
                        return (java.lang.foreign.MemorySegment)constants$35.const$2.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4, __x5, __x6, __x7, __x8, __x9);
                    } catch (Throwable ex$) {
                        throw new AssertionError("should not reach here", ex$);
                    }
                };
            }
        }

        public static VarHandle create_image$VH() {
            return constants$35.const$3;
        }
        /**
         * Getter for field:
         * {@snippet :
         * struct _XImage* (*create_image)(struct _XDisplay*,Visual*,unsigned int,int,int,char*,unsigned int,unsigned int,int,int);
         * }
         */
        public static MemorySegment create_image$get(MemorySegment seg) {
            return (java.lang.foreign.MemorySegment)constants$35.const$3.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * struct _XImage* (*create_image)(struct _XDisplay*,Visual*,unsigned int,int,int,char*,unsigned int,unsigned int,int,int);
         * }
         */
        public static void create_image$set(MemorySegment seg, MemorySegment x) {
            constants$35.const$3.set(seg, x);
        }
        public static MemorySegment create_image$get(MemorySegment seg, long index) {
            return (java.lang.foreign.MemorySegment)constants$35.const$3.get(seg.asSlice(index*sizeof()));
        }
        public static void create_image$set(MemorySegment seg, long index, MemorySegment x) {
            constants$35.const$3.set(seg.asSlice(index*sizeof()), x);
        }
        public static create_image create_image(MemorySegment segment, Arena scope) {
            return create_image.ofAddress(create_image$get(segment), scope);
        }
        /**
         * {@snippet :
 * int (*destroy_image)(struct _XImage*);
         * }
         */
        public interface destroy_image {

            int apply(java.lang.foreign.MemorySegment _x0);
            static MemorySegment allocate(destroy_image fi, Arena scope) {
                return RuntimeHelper.upcallStub(constants$35.const$4, fi, constants$11.const$0, scope);
            }
            static destroy_image ofAddress(MemorySegment addr, Arena arena) {
                MemorySegment symbol = addr.reinterpret(arena, null);
                return (java.lang.foreign.MemorySegment __x0) -> {
                    try {
                        return (int)constants$11.const$2.invokeExact(symbol, __x0);
                    } catch (Throwable ex$) {
                        throw new AssertionError("should not reach here", ex$);
                    }
                };
            }
        }

        public static VarHandle destroy_image$VH() {
            return constants$35.const$5;
        }
        /**
         * Getter for field:
         * {@snippet :
         * int (*destroy_image)(struct _XImage*);
         * }
         */
        public static MemorySegment destroy_image$get(MemorySegment seg) {
            return (java.lang.foreign.MemorySegment)constants$35.const$5.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * int (*destroy_image)(struct _XImage*);
         * }
         */
        public static void destroy_image$set(MemorySegment seg, MemorySegment x) {
            constants$35.const$5.set(seg, x);
        }
        public static MemorySegment destroy_image$get(MemorySegment seg, long index) {
            return (java.lang.foreign.MemorySegment)constants$35.const$5.get(seg.asSlice(index*sizeof()));
        }
        public static void destroy_image$set(MemorySegment seg, long index, MemorySegment x) {
            constants$35.const$5.set(seg.asSlice(index*sizeof()), x);
        }
        public static destroy_image destroy_image(MemorySegment segment, Arena scope) {
            return destroy_image.ofAddress(destroy_image$get(segment), scope);
        }
        /**
         * {@snippet :
 * unsigned long (*get_pixel)(struct _XImage*,int,int);
         * }
         */
        public interface get_pixel {

            long apply(java.lang.foreign.MemorySegment _x0, int _x1, int _x2);
            static MemorySegment allocate(get_pixel fi, Arena scope) {
                return RuntimeHelper.upcallStub(constants$36.const$1, fi, constants$36.const$0, scope);
            }
            static get_pixel ofAddress(MemorySegment addr, Arena arena) {
                MemorySegment symbol = addr.reinterpret(arena, null);
                return (java.lang.foreign.MemorySegment __x0, int __x1, int __x2) -> {
                    try {
                        return (long)constants$36.const$2.invokeExact(symbol, __x0, __x1, __x2);
                    } catch (Throwable ex$) {
                        throw new AssertionError("should not reach here", ex$);
                    }
                };
            }
        }

        public static VarHandle get_pixel$VH() {
            return constants$36.const$3;
        }
        /**
         * Getter for field:
         * {@snippet :
         * unsigned long (*get_pixel)(struct _XImage*,int,int);
         * }
         */
        public static MemorySegment get_pixel$get(MemorySegment seg) {
            return (java.lang.foreign.MemorySegment)constants$36.const$3.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * unsigned long (*get_pixel)(struct _XImage*,int,int);
         * }
         */
        public static void get_pixel$set(MemorySegment seg, MemorySegment x) {
            constants$36.const$3.set(seg, x);
        }
        public static MemorySegment get_pixel$get(MemorySegment seg, long index) {
            return (java.lang.foreign.MemorySegment)constants$36.const$3.get(seg.asSlice(index*sizeof()));
        }
        public static void get_pixel$set(MemorySegment seg, long index, MemorySegment x) {
            constants$36.const$3.set(seg.asSlice(index*sizeof()), x);
        }
        public static get_pixel get_pixel(MemorySegment segment, Arena scope) {
            return get_pixel.ofAddress(get_pixel$get(segment), scope);
        }
        /**
         * {@snippet :
 * int (*put_pixel)(struct _XImage*,int,int,unsigned long);
         * }
         */
        public interface put_pixel {

            int apply(java.lang.foreign.MemorySegment _x0, int _x1, int _x2, long _x3);
            static MemorySegment allocate(put_pixel fi, Arena scope) {
                return RuntimeHelper.upcallStub(constants$36.const$5, fi, constants$36.const$4, scope);
            }
            static put_pixel ofAddress(MemorySegment addr, Arena arena) {
                MemorySegment symbol = addr.reinterpret(arena, null);
                return (java.lang.foreign.MemorySegment __x0, int __x1, int __x2, long __x3) -> {
                    try {
                        return (int)constants$37.const$0.invokeExact(symbol, __x0, __x1, __x2, __x3);
                    } catch (Throwable ex$) {
                        throw new AssertionError("should not reach here", ex$);
                    }
                };
            }
        }

        public static VarHandle put_pixel$VH() {
            return constants$37.const$1;
        }
        /**
         * Getter for field:
         * {@snippet :
         * int (*put_pixel)(struct _XImage*,int,int,unsigned long);
         * }
         */
        public static MemorySegment put_pixel$get(MemorySegment seg) {
            return (java.lang.foreign.MemorySegment)constants$37.const$1.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * int (*put_pixel)(struct _XImage*,int,int,unsigned long);
         * }
         */
        public static void put_pixel$set(MemorySegment seg, MemorySegment x) {
            constants$37.const$1.set(seg, x);
        }
        public static MemorySegment put_pixel$get(MemorySegment seg, long index) {
            return (java.lang.foreign.MemorySegment)constants$37.const$1.get(seg.asSlice(index*sizeof()));
        }
        public static void put_pixel$set(MemorySegment seg, long index, MemorySegment x) {
            constants$37.const$1.set(seg.asSlice(index*sizeof()), x);
        }
        public static put_pixel put_pixel(MemorySegment segment, Arena scope) {
            return put_pixel.ofAddress(put_pixel$get(segment), scope);
        }
        /**
         * {@snippet :
 * struct _XImage* (*sub_image)(struct _XImage*,int,int,unsigned int,unsigned int);
         * }
         */
        public interface sub_image {

            java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment _x0, int _x1, int _x2, int _x3, int _x4);
            static MemorySegment allocate(sub_image fi, Arena scope) {
                return RuntimeHelper.upcallStub(constants$37.const$3, fi, constants$37.const$2, scope);
            }
            static sub_image ofAddress(MemorySegment addr, Arena arena) {
                MemorySegment symbol = addr.reinterpret(arena, null);
                return (java.lang.foreign.MemorySegment __x0, int __x1, int __x2, int __x3, int __x4) -> {
                    try {
                        return (java.lang.foreign.MemorySegment)constants$37.const$4.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4);
                    } catch (Throwable ex$) {
                        throw new AssertionError("should not reach here", ex$);
                    }
                };
            }
        }

        public static VarHandle sub_image$VH() {
            return constants$37.const$5;
        }
        /**
         * Getter for field:
         * {@snippet :
         * struct _XImage* (*sub_image)(struct _XImage*,int,int,unsigned int,unsigned int);
         * }
         */
        public static MemorySegment sub_image$get(MemorySegment seg) {
            return (java.lang.foreign.MemorySegment)constants$37.const$5.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * struct _XImage* (*sub_image)(struct _XImage*,int,int,unsigned int,unsigned int);
         * }
         */
        public static void sub_image$set(MemorySegment seg, MemorySegment x) {
            constants$37.const$5.set(seg, x);
        }
        public static MemorySegment sub_image$get(MemorySegment seg, long index) {
            return (java.lang.foreign.MemorySegment)constants$37.const$5.get(seg.asSlice(index*sizeof()));
        }
        public static void sub_image$set(MemorySegment seg, long index, MemorySegment x) {
            constants$37.const$5.set(seg.asSlice(index*sizeof()), x);
        }
        public static sub_image sub_image(MemorySegment segment, Arena scope) {
            return sub_image.ofAddress(sub_image$get(segment), scope);
        }
        /**
         * {@snippet :
 * int (*add_pixel)(struct _XImage*,long);
         * }
         */
        public interface add_pixel {

            int apply(java.lang.foreign.MemorySegment _x0, long _x1);
            static MemorySegment allocate(add_pixel fi, Arena scope) {
                return RuntimeHelper.upcallStub(constants$38.const$1, fi, constants$38.const$0, scope);
            }
            static add_pixel ofAddress(MemorySegment addr, Arena arena) {
                MemorySegment symbol = addr.reinterpret(arena, null);
                return (java.lang.foreign.MemorySegment __x0, long __x1) -> {
                    try {
                        return (int)constants$38.const$2.invokeExact(symbol, __x0, __x1);
                    } catch (Throwable ex$) {
                        throw new AssertionError("should not reach here", ex$);
                    }
                };
            }
        }

        public static VarHandle add_pixel$VH() {
            return constants$38.const$3;
        }
        /**
         * Getter for field:
         * {@snippet :
         * int (*add_pixel)(struct _XImage*,long);
         * }
         */
        public static MemorySegment add_pixel$get(MemorySegment seg) {
            return (java.lang.foreign.MemorySegment)constants$38.const$3.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * int (*add_pixel)(struct _XImage*,long);
         * }
         */
        public static void add_pixel$set(MemorySegment seg, MemorySegment x) {
            constants$38.const$3.set(seg, x);
        }
        public static MemorySegment add_pixel$get(MemorySegment seg, long index) {
            return (java.lang.foreign.MemorySegment)constants$38.const$3.get(seg.asSlice(index*sizeof()));
        }
        public static void add_pixel$set(MemorySegment seg, long index, MemorySegment x) {
            constants$38.const$3.set(seg.asSlice(index*sizeof()), x);
        }
        public static add_pixel add_pixel(MemorySegment segment, Arena scope) {
            return add_pixel.ofAddress(add_pixel$get(segment), scope);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
    }

    public static MemorySegment f$slice(MemorySegment seg) {
        return seg.asSlice(88, 48);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


