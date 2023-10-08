// Generated by jextract

package tech.bitey.golpanama.xlib;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct {
 *     Pixmap background_pixmap;
 *     unsigned long background_pixel;
 *     Pixmap border_pixmap;
 *     unsigned long border_pixel;
 *     int bit_gravity;
 *     int win_gravity;
 *     int backing_store;
 *     unsigned long backing_planes;
 *     unsigned long backing_pixel;
 *     int save_under;
 *     long event_mask;
 *     long do_not_propagate_mask;
 *     int override_redirect;
 *     Colormap colormap;
 *     Cursor cursor;
 * };
 * }
 */
public class XSetWindowAttributes {

    public static MemoryLayout $LAYOUT() {
        return constants$23.const$5;
    }
    public static VarHandle background_pixmap$VH() {
        return constants$24.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Pixmap background_pixmap;
     * }
     */
    public static long background_pixmap$get(MemorySegment seg) {
        return (long)constants$24.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Pixmap background_pixmap;
     * }
     */
    public static void background_pixmap$set(MemorySegment seg, long x) {
        constants$24.const$0.set(seg, x);
    }
    public static long background_pixmap$get(MemorySegment seg, long index) {
        return (long)constants$24.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void background_pixmap$set(MemorySegment seg, long index, long x) {
        constants$24.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle background_pixel$VH() {
        return constants$24.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long background_pixel;
     * }
     */
    public static long background_pixel$get(MemorySegment seg) {
        return (long)constants$24.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long background_pixel;
     * }
     */
    public static void background_pixel$set(MemorySegment seg, long x) {
        constants$24.const$1.set(seg, x);
    }
    public static long background_pixel$get(MemorySegment seg, long index) {
        return (long)constants$24.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void background_pixel$set(MemorySegment seg, long index, long x) {
        constants$24.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle border_pixmap$VH() {
        return constants$24.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Pixmap border_pixmap;
     * }
     */
    public static long border_pixmap$get(MemorySegment seg) {
        return (long)constants$24.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Pixmap border_pixmap;
     * }
     */
    public static void border_pixmap$set(MemorySegment seg, long x) {
        constants$24.const$2.set(seg, x);
    }
    public static long border_pixmap$get(MemorySegment seg, long index) {
        return (long)constants$24.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void border_pixmap$set(MemorySegment seg, long index, long x) {
        constants$24.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle border_pixel$VH() {
        return constants$24.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long border_pixel;
     * }
     */
    public static long border_pixel$get(MemorySegment seg) {
        return (long)constants$24.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long border_pixel;
     * }
     */
    public static void border_pixel$set(MemorySegment seg, long x) {
        constants$24.const$3.set(seg, x);
    }
    public static long border_pixel$get(MemorySegment seg, long index) {
        return (long)constants$24.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void border_pixel$set(MemorySegment seg, long index, long x) {
        constants$24.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle bit_gravity$VH() {
        return constants$24.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int bit_gravity;
     * }
     */
    public static int bit_gravity$get(MemorySegment seg) {
        return (int)constants$24.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int bit_gravity;
     * }
     */
    public static void bit_gravity$set(MemorySegment seg, int x) {
        constants$24.const$4.set(seg, x);
    }
    public static int bit_gravity$get(MemorySegment seg, long index) {
        return (int)constants$24.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void bit_gravity$set(MemorySegment seg, long index, int x) {
        constants$24.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle win_gravity$VH() {
        return constants$24.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int win_gravity;
     * }
     */
    public static int win_gravity$get(MemorySegment seg) {
        return (int)constants$24.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int win_gravity;
     * }
     */
    public static void win_gravity$set(MemorySegment seg, int x) {
        constants$24.const$5.set(seg, x);
    }
    public static int win_gravity$get(MemorySegment seg, long index) {
        return (int)constants$24.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void win_gravity$set(MemorySegment seg, long index, int x) {
        constants$24.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle backing_store$VH() {
        return constants$25.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int backing_store;
     * }
     */
    public static int backing_store$get(MemorySegment seg) {
        return (int)constants$25.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int backing_store;
     * }
     */
    public static void backing_store$set(MemorySegment seg, int x) {
        constants$25.const$0.set(seg, x);
    }
    public static int backing_store$get(MemorySegment seg, long index) {
        return (int)constants$25.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void backing_store$set(MemorySegment seg, long index, int x) {
        constants$25.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle backing_planes$VH() {
        return constants$25.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long backing_planes;
     * }
     */
    public static long backing_planes$get(MemorySegment seg) {
        return (long)constants$25.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long backing_planes;
     * }
     */
    public static void backing_planes$set(MemorySegment seg, long x) {
        constants$25.const$1.set(seg, x);
    }
    public static long backing_planes$get(MemorySegment seg, long index) {
        return (long)constants$25.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void backing_planes$set(MemorySegment seg, long index, long x) {
        constants$25.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle backing_pixel$VH() {
        return constants$25.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long backing_pixel;
     * }
     */
    public static long backing_pixel$get(MemorySegment seg) {
        return (long)constants$25.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long backing_pixel;
     * }
     */
    public static void backing_pixel$set(MemorySegment seg, long x) {
        constants$25.const$2.set(seg, x);
    }
    public static long backing_pixel$get(MemorySegment seg, long index) {
        return (long)constants$25.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void backing_pixel$set(MemorySegment seg, long index, long x) {
        constants$25.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle save_under$VH() {
        return constants$25.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int save_under;
     * }
     */
    public static int save_under$get(MemorySegment seg) {
        return (int)constants$25.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int save_under;
     * }
     */
    public static void save_under$set(MemorySegment seg, int x) {
        constants$25.const$3.set(seg, x);
    }
    public static int save_under$get(MemorySegment seg, long index) {
        return (int)constants$25.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void save_under$set(MemorySegment seg, long index, int x) {
        constants$25.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle event_mask$VH() {
        return constants$25.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * long event_mask;
     * }
     */
    public static long event_mask$get(MemorySegment seg) {
        return (long)constants$25.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * long event_mask;
     * }
     */
    public static void event_mask$set(MemorySegment seg, long x) {
        constants$25.const$4.set(seg, x);
    }
    public static long event_mask$get(MemorySegment seg, long index) {
        return (long)constants$25.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void event_mask$set(MemorySegment seg, long index, long x) {
        constants$25.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle do_not_propagate_mask$VH() {
        return constants$25.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * long do_not_propagate_mask;
     * }
     */
    public static long do_not_propagate_mask$get(MemorySegment seg) {
        return (long)constants$25.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * long do_not_propagate_mask;
     * }
     */
    public static void do_not_propagate_mask$set(MemorySegment seg, long x) {
        constants$25.const$5.set(seg, x);
    }
    public static long do_not_propagate_mask$get(MemorySegment seg, long index) {
        return (long)constants$25.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void do_not_propagate_mask$set(MemorySegment seg, long index, long x) {
        constants$25.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle override_redirect$VH() {
        return constants$26.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int override_redirect;
     * }
     */
    public static int override_redirect$get(MemorySegment seg) {
        return (int)constants$26.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int override_redirect;
     * }
     */
    public static void override_redirect$set(MemorySegment seg, int x) {
        constants$26.const$0.set(seg, x);
    }
    public static int override_redirect$get(MemorySegment seg, long index) {
        return (int)constants$26.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void override_redirect$set(MemorySegment seg, long index, int x) {
        constants$26.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle colormap$VH() {
        return constants$26.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Colormap colormap;
     * }
     */
    public static long colormap$get(MemorySegment seg) {
        return (long)constants$26.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Colormap colormap;
     * }
     */
    public static void colormap$set(MemorySegment seg, long x) {
        constants$26.const$1.set(seg, x);
    }
    public static long colormap$get(MemorySegment seg, long index) {
        return (long)constants$26.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void colormap$set(MemorySegment seg, long index, long x) {
        constants$26.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle cursor$VH() {
        return constants$26.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Cursor cursor;
     * }
     */
    public static long cursor$get(MemorySegment seg) {
        return (long)constants$26.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Cursor cursor;
     * }
     */
    public static void cursor$set(MemorySegment seg, long x) {
        constants$26.const$2.set(seg, x);
    }
    public static long cursor$get(MemorySegment seg, long index) {
        return (long)constants$26.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void cursor$set(MemorySegment seg, long index, long x) {
        constants$26.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


