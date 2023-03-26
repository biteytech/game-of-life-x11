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
 *     int request;
 *     int first_keycode;
 *     int count;
 * };
 * }
 */
public class XMappingEvent {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("type"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_LONG_LONG$LAYOUT.withName("serial"),
        Constants$root.C_INT$LAYOUT.withName("send_event"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("display"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("window"),
        Constants$root.C_INT$LAYOUT.withName("request"),
        Constants$root.C_INT$LAYOUT.withName("first_keycode"),
        Constants$root.C_INT$LAYOUT.withName("count"),
        MemoryLayout.paddingLayout(32)
    );
    public static MemoryLayout $LAYOUT() {
        return XMappingEvent.$struct$LAYOUT;
    }
    static final VarHandle type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("type"));
    public static VarHandle type$VH() {
        return XMappingEvent.type$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int type;
     * }
     */
    public static int type$get(MemorySegment seg) {
        return (int)XMappingEvent.type$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int type;
     * }
     */
    public static void type$set(MemorySegment seg, int x) {
        XMappingEvent.type$VH.set(seg, x);
    }
    public static int type$get(MemorySegment seg, long index) {
        return (int)XMappingEvent.type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void type$set(MemorySegment seg, long index, int x) {
        XMappingEvent.type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle serial$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("serial"));
    public static VarHandle serial$VH() {
        return XMappingEvent.serial$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long serial;
     * }
     */
    public static long serial$get(MemorySegment seg) {
        return (long)XMappingEvent.serial$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long serial;
     * }
     */
    public static void serial$set(MemorySegment seg, long x) {
        XMappingEvent.serial$VH.set(seg, x);
    }
    public static long serial$get(MemorySegment seg, long index) {
        return (long)XMappingEvent.serial$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void serial$set(MemorySegment seg, long index, long x) {
        XMappingEvent.serial$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle send_event$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("send_event"));
    public static VarHandle send_event$VH() {
        return XMappingEvent.send_event$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int send_event;
     * }
     */
    public static int send_event$get(MemorySegment seg) {
        return (int)XMappingEvent.send_event$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int send_event;
     * }
     */
    public static void send_event$set(MemorySegment seg, int x) {
        XMappingEvent.send_event$VH.set(seg, x);
    }
    public static int send_event$get(MemorySegment seg, long index) {
        return (int)XMappingEvent.send_event$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void send_event$set(MemorySegment seg, long index, int x) {
        XMappingEvent.send_event$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle display$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("display"));
    public static VarHandle display$VH() {
        return XMappingEvent.display$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Display* display;
     * }
     */
    public static MemorySegment display$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)XMappingEvent.display$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Display* display;
     * }
     */
    public static void display$set(MemorySegment seg, MemorySegment x) {
        XMappingEvent.display$VH.set(seg, x);
    }
    public static MemorySegment display$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)XMappingEvent.display$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void display$set(MemorySegment seg, long index, MemorySegment x) {
        XMappingEvent.display$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle window$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("window"));
    public static VarHandle window$VH() {
        return XMappingEvent.window$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Window window;
     * }
     */
    public static long window$get(MemorySegment seg) {
        return (long)XMappingEvent.window$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Window window;
     * }
     */
    public static void window$set(MemorySegment seg, long x) {
        XMappingEvent.window$VH.set(seg, x);
    }
    public static long window$get(MemorySegment seg, long index) {
        return (long)XMappingEvent.window$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void window$set(MemorySegment seg, long index, long x) {
        XMappingEvent.window$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle request$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("request"));
    public static VarHandle request$VH() {
        return XMappingEvent.request$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int request;
     * }
     */
    public static int request$get(MemorySegment seg) {
        return (int)XMappingEvent.request$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int request;
     * }
     */
    public static void request$set(MemorySegment seg, int x) {
        XMappingEvent.request$VH.set(seg, x);
    }
    public static int request$get(MemorySegment seg, long index) {
        return (int)XMappingEvent.request$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void request$set(MemorySegment seg, long index, int x) {
        XMappingEvent.request$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle first_keycode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("first_keycode"));
    public static VarHandle first_keycode$VH() {
        return XMappingEvent.first_keycode$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int first_keycode;
     * }
     */
    public static int first_keycode$get(MemorySegment seg) {
        return (int)XMappingEvent.first_keycode$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int first_keycode;
     * }
     */
    public static void first_keycode$set(MemorySegment seg, int x) {
        XMappingEvent.first_keycode$VH.set(seg, x);
    }
    public static int first_keycode$get(MemorySegment seg, long index) {
        return (int)XMappingEvent.first_keycode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void first_keycode$set(MemorySegment seg, long index, int x) {
        XMappingEvent.first_keycode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle count$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("count"));
    public static VarHandle count$VH() {
        return XMappingEvent.count$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int count;
     * }
     */
    public static int count$get(MemorySegment seg) {
        return (int)XMappingEvent.count$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int count;
     * }
     */
    public static void count$set(MemorySegment seg, int x) {
        XMappingEvent.count$VH.set(seg, x);
    }
    public static int count$get(MemorySegment seg, long index) {
        return (int)XMappingEvent.count$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void count$set(MemorySegment seg, long index, int x) {
        XMappingEvent.count$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


