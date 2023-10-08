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
 *     int type;
 *     unsigned long serial;
 *     int send_event;
 *     Display* display;
 *     Window window;
 *     Window root;
 *     Window subwindow;
 *     Time time;
 *     int x;
 *     int y;
 *     int x_root;
 *     int y_root;
 *     unsigned int state;
 *     unsigned int keycode;
 *     int same_screen;
 * };
 * }
 */
public class XKeyEvent {

    public static MemoryLayout $LAYOUT() {
        return constants$48.const$2;
    }
    public static VarHandle type$VH() {
        return constants$48.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int type;
     * }
     */
    public static int type$get(MemorySegment seg) {
        return (int)constants$48.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int type;
     * }
     */
    public static void type$set(MemorySegment seg, int x) {
        constants$48.const$3.set(seg, x);
    }
    public static int type$get(MemorySegment seg, long index) {
        return (int)constants$48.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void type$set(MemorySegment seg, long index, int x) {
        constants$48.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle serial$VH() {
        return constants$48.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long serial;
     * }
     */
    public static long serial$get(MemorySegment seg) {
        return (long)constants$48.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long serial;
     * }
     */
    public static void serial$set(MemorySegment seg, long x) {
        constants$48.const$4.set(seg, x);
    }
    public static long serial$get(MemorySegment seg, long index) {
        return (long)constants$48.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void serial$set(MemorySegment seg, long index, long x) {
        constants$48.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle send_event$VH() {
        return constants$48.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int send_event;
     * }
     */
    public static int send_event$get(MemorySegment seg) {
        return (int)constants$48.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int send_event;
     * }
     */
    public static void send_event$set(MemorySegment seg, int x) {
        constants$48.const$5.set(seg, x);
    }
    public static int send_event$get(MemorySegment seg, long index) {
        return (int)constants$48.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void send_event$set(MemorySegment seg, long index, int x) {
        constants$48.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle display$VH() {
        return constants$49.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Display* display;
     * }
     */
    public static MemorySegment display$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$49.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Display* display;
     * }
     */
    public static void display$set(MemorySegment seg, MemorySegment x) {
        constants$49.const$0.set(seg, x);
    }
    public static MemorySegment display$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$49.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void display$set(MemorySegment seg, long index, MemorySegment x) {
        constants$49.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle window$VH() {
        return constants$49.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Window window;
     * }
     */
    public static long window$get(MemorySegment seg) {
        return (long)constants$49.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Window window;
     * }
     */
    public static void window$set(MemorySegment seg, long x) {
        constants$49.const$1.set(seg, x);
    }
    public static long window$get(MemorySegment seg, long index) {
        return (long)constants$49.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void window$set(MemorySegment seg, long index, long x) {
        constants$49.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle root$VH() {
        return constants$49.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Window root;
     * }
     */
    public static long root$get(MemorySegment seg) {
        return (long)constants$49.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Window root;
     * }
     */
    public static void root$set(MemorySegment seg, long x) {
        constants$49.const$2.set(seg, x);
    }
    public static long root$get(MemorySegment seg, long index) {
        return (long)constants$49.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void root$set(MemorySegment seg, long index, long x) {
        constants$49.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle subwindow$VH() {
        return constants$49.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Window subwindow;
     * }
     */
    public static long subwindow$get(MemorySegment seg) {
        return (long)constants$49.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Window subwindow;
     * }
     */
    public static void subwindow$set(MemorySegment seg, long x) {
        constants$49.const$3.set(seg, x);
    }
    public static long subwindow$get(MemorySegment seg, long index) {
        return (long)constants$49.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void subwindow$set(MemorySegment seg, long index, long x) {
        constants$49.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle time$VH() {
        return constants$49.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Time time;
     * }
     */
    public static long time$get(MemorySegment seg) {
        return (long)constants$49.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Time time;
     * }
     */
    public static void time$set(MemorySegment seg, long x) {
        constants$49.const$4.set(seg, x);
    }
    public static long time$get(MemorySegment seg, long index) {
        return (long)constants$49.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void time$set(MemorySegment seg, long index, long x) {
        constants$49.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle x$VH() {
        return constants$49.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int x;
     * }
     */
    public static int x$get(MemorySegment seg) {
        return (int)constants$49.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int x;
     * }
     */
    public static void x$set(MemorySegment seg, int x) {
        constants$49.const$5.set(seg, x);
    }
    public static int x$get(MemorySegment seg, long index) {
        return (int)constants$49.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void x$set(MemorySegment seg, long index, int x) {
        constants$49.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle y$VH() {
        return constants$50.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int y;
     * }
     */
    public static int y$get(MemorySegment seg) {
        return (int)constants$50.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int y;
     * }
     */
    public static void y$set(MemorySegment seg, int x) {
        constants$50.const$0.set(seg, x);
    }
    public static int y$get(MemorySegment seg, long index) {
        return (int)constants$50.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void y$set(MemorySegment seg, long index, int x) {
        constants$50.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle x_root$VH() {
        return constants$50.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int x_root;
     * }
     */
    public static int x_root$get(MemorySegment seg) {
        return (int)constants$50.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int x_root;
     * }
     */
    public static void x_root$set(MemorySegment seg, int x) {
        constants$50.const$1.set(seg, x);
    }
    public static int x_root$get(MemorySegment seg, long index) {
        return (int)constants$50.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void x_root$set(MemorySegment seg, long index, int x) {
        constants$50.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle y_root$VH() {
        return constants$50.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int y_root;
     * }
     */
    public static int y_root$get(MemorySegment seg) {
        return (int)constants$50.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int y_root;
     * }
     */
    public static void y_root$set(MemorySegment seg, int x) {
        constants$50.const$2.set(seg, x);
    }
    public static int y_root$get(MemorySegment seg, long index) {
        return (int)constants$50.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void y_root$set(MemorySegment seg, long index, int x) {
        constants$50.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle state$VH() {
        return constants$50.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int state;
     * }
     */
    public static int state$get(MemorySegment seg) {
        return (int)constants$50.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int state;
     * }
     */
    public static void state$set(MemorySegment seg, int x) {
        constants$50.const$3.set(seg, x);
    }
    public static int state$get(MemorySegment seg, long index) {
        return (int)constants$50.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void state$set(MemorySegment seg, long index, int x) {
        constants$50.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle keycode$VH() {
        return constants$50.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int keycode;
     * }
     */
    public static int keycode$get(MemorySegment seg) {
        return (int)constants$50.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int keycode;
     * }
     */
    public static void keycode$set(MemorySegment seg, int x) {
        constants$50.const$4.set(seg, x);
    }
    public static int keycode$get(MemorySegment seg, long index) {
        return (int)constants$50.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void keycode$set(MemorySegment seg, long index, int x) {
        constants$50.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle same_screen$VH() {
        return constants$50.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int same_screen;
     * }
     */
    public static int same_screen$get(MemorySegment seg) {
        return (int)constants$50.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int same_screen;
     * }
     */
    public static void same_screen$set(MemorySegment seg, int x) {
        constants$50.const$5.set(seg, x);
    }
    public static int same_screen$get(MemorySegment seg, long index) {
        return (int)constants$50.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void same_screen$set(MemorySegment seg, long index, int x) {
        constants$50.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


